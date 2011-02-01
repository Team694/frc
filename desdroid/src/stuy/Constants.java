package stuy;

public interface Constants {

    // Robot Hardware Configuration
    final int DRIVE_CAN_DEVICE_FRONT_LEFT    = 3;
    final int DRIVE_CAN_DEVICE_FRONT_RIGHT   = 4;
    final int DRIVE_CAN_DEVICE_REAR_LEFT     = 2;
    final int DRIVE_CAN_DEVICE_REAR_RIGHT    = 5;

    final int ARM_CAN_DEVICE_NUMBER          = 6;

    final int GRABBER_UPPER_ROLLER_DEVICE    = 7;
    final int GRABBER_LOWER_ROLLER_DEVICE    = 8;

    final int LINE_SENSOR_LEFT_CHANNEL       = 1;
    final int LINE_SENSOR_MIDDLE_CHANNEL     = 2;
    final int LINE_SENSOR_RIGHT_CHANNEL      = 3;

    final int GYRO_CHANNEL                   = 4;

    final int DIGITAL_IN_STRAIGHT_LINE       = 1;
    final int DIGITAL_IN_GO_LEFT             = 2;

    // User Controls
    final int PORT_GAMEPAD                   = 1;
    final int AXIS_GAMEPAD_LEFT              = 2;
    final int AXIS_GAMEPAD_RIGHT             = 4;

    final int BIT_4_CHANNEL = 16; // From Donovan OI box
    final int BIT_3_CHANNEL = 14;
    final int BIT_2_CHANNEL = 12;
    final int BIT_1_CHANNEL = 10;

    final int DO_NOTHING_SWITCH = 2;
    final int DROP_UBERTUBE_SWITCH = 4;
    final int DIRECTION_SWITCH_LEFT = 6;
    final int DIRECTION_SWITCH_RIGHT = 8;


    // Line Tracking
    final double DEFAULT_STEERING_GAIN  = 0.3;
    final double FORK_PROFILE[]         = {.7, .7, .55, .6, .6, .5, .4, 0};
    final double STRAIGHT_PROFILE[]     = {.8, .9, 1, 1, .7, .7, .6, 0};
}
