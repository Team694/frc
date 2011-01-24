package stuy;
/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class DESdroid extends SimpleRobot implements Constants {

    // Robot hardware
    CANJaguar driveFrontLeft, driveFrontRight, driveRearLeft, driveRearRight;
    RobotDrive drive;
    Arm arm;
    Grabber grabber;

    // Driver controls
    Joystick gamepad;
    Joystick armStick;

    // Autonomous class
    Autonomous auton;


    public DESdroid() {
        try {
            driveFrontLeft  = new CANJaguar(DRIVE_CAN_DEVICE_FRONT_LEFT);
            driveFrontRight = new CANJaguar(DRIVE_CAN_DEVICE_FRONT_RIGHT);
            driveRearLeft   = new CANJaguar(DRIVE_CAN_DEVICE_REAR_LEFT);
            driveRearRight  = new CANJaguar(DRIVE_CAN_DEVICE_REAR_RIGHT);
        }
        catch (Exception e) {

        }

        drive = new RobotDrive(driveFrontLeft,
                               driveRearLeft,
                               driveFrontRight,
                               driveRearRight);

        grabber = new Grabber();


        gamepad  = new Joystick(PORT_GAMEPAD);
        armStick = new Joystick(PORT_ARM_STICK);
    }

    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
	
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        getWatchdog().setEnabled(false);

        while (isEnabled() && isOperatorControl()) {
            drive.mecanumDrive_Cartesian(
                    gamepad.getRawAxis(1),  // X translation (horizontal strafe)
                    gamepad.getRawAxis(2),  // Y translation (straight forward)
                    gamepad.getRawAxis(3),  // rotation (clockwise?)
                    0.0);                   // use gyro for field-oriented drive

            arm.rotate(armStick.getY());

            // Control grabber: how?
        }
    }
}
