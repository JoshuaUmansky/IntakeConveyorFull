/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class subConveyor extends Subsystem {
  
  private VictorSP conveyMC = new VictorSP(RobotMap.conveyorMotor);
  
  @Override
  public void initDefaultCommand() {
    
  }

  public void forward()
  {
    conveyMC.set(0.5);
  }

  public void backward()
  {
    conveyMC.set(-0.5);
  }

  public void stop()
  {
    conveyMC.set(0);
  }
}
