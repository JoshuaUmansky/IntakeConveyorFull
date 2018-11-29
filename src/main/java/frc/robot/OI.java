/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.comFastShoot;
import frc.robot.commands.comIntake;
import frc.robot.commands.comSlowShoot;
import frc.robot.commands.comStopAll;

public class OI {
  public XboxController opXbox;
  public Joystick opStick;
  
  public OI()
  {
    opXbox = new XboxController(3);
    opStick = new Joystick(0);
    Button button1 = new JoystickButton(opStick, 1);
    Button button2 = new JoystickButton(opStick, 2);
    Button button3 = new JoystickButton(opStick, 3);
    button1.whileHeld(new comFastShoot());
    button2.whileHeld(new comIntake());
    button3.whileHeld(new comSlowShoot());

    button1.whenReleased(new comStopAll());
    button2.whenReleased(new comStopAll());
    button3.whenReleased(new comStopAll());
  }
}
