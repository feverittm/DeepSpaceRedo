/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

import frc.robot.RobotMap;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends Command {
  private Joystick gamepad1;  
  private DriveTrain driveTrain;

  public ArcadeDrive() {
    Joystick gamepad1 = new Joystick(RobotMap.Ports.gamepad1);
    DriveTrain driveTrian = new DriveTrain();
    requires(driveTrain);
  }

  private double getLeftYAxis() {
    return -gamepad1.getRawAxis(RobotMap.Ports.leftYAxis);
  }

  private double getRightXAxis() {
    return gamepad1.getRawAxis(RobotMap.Ports.rightXAxis);
  }

  @Override
  protected void initialize() { }

  @Override
  protected void execute() {
    double left = getLeftYAxis() + getRightXAxis();
    double right = getLeftYAxis() - getRightXAxis();

    driveTrain.setVolts(left, right);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    driveTrain.stop();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
