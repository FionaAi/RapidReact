// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class ArcadeDrive extends CommandBase {

  private final DriveTrain drivetrain;

  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(DriveTrain subsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    drivetrain = subsystem;

    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.arcadeDrive(RobotContainer.k_driver.getRawAxis(1), RobotContainer.k_driver.getRawAxis(4), true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
