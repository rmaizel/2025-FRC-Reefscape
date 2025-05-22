package frc.robot.subsystems.score;

public class ShooterConstants {
    private static double MAX_SPEED = 0.2;
    public enum MotorSpeed {
        // SETTING(RightSpeed,LeftSpeed)
        MAX(MAX_SPEED,-MAX_SPEED),
        INTAKE(0.05,-0.05),
        L1(),L2,L3,L4
    }
    //shooter speeds
    public static final double LeftMaxShooterSpeed = -0.2;
    public static final double RightMaxShooterSpeed = 0.2;

    public static final double L1LeftShooterSpeed = -0.3;
    public static final double L1RightShooterSpeed = -0.1;

    public static final double leftIntakeSpeed = 0.05;
    public static final double rightIntakeSpeed = -0.05;

    public static final double L23leftshooterSpeed = -0.15;
    public static final double L23rightshooterSpeed = 0.15;

}
