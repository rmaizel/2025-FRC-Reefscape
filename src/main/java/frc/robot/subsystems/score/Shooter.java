package frc.robot.subsystems.score;
//NOTE: We don't need to IMPORT classes in the same package

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Config;

public class Shooter extends SubsystemBase {
    // Constructors
    private SparkMaxConfig motorConfig = new SparkMaxConfig();
    private SparkMax rightShooterMotor = new SparkMax(Config.CAN_ID.get("SHOOTER_MOTOR_R"), MotorType.kBrushless);
    private SparkMax leftShooterMotor = new SparkMax(Config.CAN_ID.get("SHOOTER_MOTOR_L"), MotorType.kBrushless);

}
