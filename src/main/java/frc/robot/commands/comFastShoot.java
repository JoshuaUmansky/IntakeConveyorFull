/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.subIntake;

public class comFastShoot extends Command {
  
  public static OI oi = new OI();
  public static subIntake Intake = new subIntake();
  
  public comFastShoot() {
    requires(Intake);
  }
  @Override
  protected void initialize() {
  }
  @Override
  protected void execute()
  {
    Intake.FastShoot();
  }
  @Override
  protected boolean isFinished() {
    return false;
  }
  @Override
  protected void end() {
    Intake.StopIntakeMotor();
  }
  @Override
  protected void interrupted() {
    end();
  }
}
