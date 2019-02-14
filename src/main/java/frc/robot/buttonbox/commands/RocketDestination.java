/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.buttonbox.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.DeepspaceOperator2Console;
import frc.robot.Robot;

public class RocketDestination extends Command {
  private final DeepspaceOperator2Console buttonBox;

  public RocketDestination() {
    this(Robot.buttonBox);
  }

  public RocketDestination(DeepspaceOperator2Console buttonBox) {
    this.buttonBox = buttonBox;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    buttonBox.clickScoringDestinationRocketButton();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
