package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class subIntake extends Subsystem {
  
  private VictorSP IntakeLMotor = new VictorSP(RobotMap.IntakeLMotor);
  private VictorSP IntakeRMotor = new VictorSP(RobotMap.IntakeRMotor);
  
  @Override
  public void initDefaultCommand() {
    
  }

  public void Intake()
  {
    IntakeLMotor.set(-0.5);
    IntakeRMotor.set(-0.5);
  }

  public void FastShoot()
  {
    IntakeLMotor.set(0.7);
    IntakeRMotor.set(0.7);
  }

  public void SlowShoot()
  {
    IntakeLMotor.set(0.3);
    IntakeRMotor.set(0.3);
  }
  public void StopIntakeMotor()
  {
    IntakeLMotor.set(0);
    IntakeRMotor.set(0);
  }
}