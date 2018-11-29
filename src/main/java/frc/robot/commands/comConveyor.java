/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.subConveyor;

public class comConveyor extends Command {
  
  public static OI oi = new OI();
  public static subConveyor conveyor = new subConveyor();
  
  public comConveyor() {
    requires(conveyor);
  }
  @Override
  protected void initialize() {
  }
  @Override
  protected void execute()
  {
    double conY = oi.opXbox.getRawAxis(1);
  }
  @Override
  protected boolean isFinished() {
    return false;
  }
  @Override
  protected void end() {
  }
  @Override
  protected void interrupted() {
  }
}
