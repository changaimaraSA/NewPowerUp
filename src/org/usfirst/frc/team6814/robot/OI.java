/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6814.robot;

import org.usfirst.frc.team6814.robot.commands.ClimbDown;
import org.usfirst.frc.team6814.robot.commands.ClimbUp;
import org.usfirst.frc.team6814.robot.commands.DriveGearDown;
import org.usfirst.frc.team6814.robot.commands.DriveGearUp;
import org.usfirst.frc.team6814.robot.commands.DriveTeleDPad;
import org.usfirst.frc.team6814.robot.commands.IntakeIn;
import org.usfirst.frc.team6814.robot.commands.IntakeOut;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick m_joystick = new Joystick(0);

	public OI() {
		// Put Some buttons on the SmartDashboard
//		SmartDashboard.putData("Elevator Up", new SetElevatorSetpoint(0));
//		SmartDashboard.putData("Elevator Down", new SetElevatorSetpoint(0.2));
//		SmartDashboard.putData("Elevator Stop", new SetElevatorSetpoint(0.3));
//
//		SmartDashboard.putData("Wrist Horizontal", new SetWristSetpoint(0));
//		SmartDashboard.putData("Raise Wrist", new SetWristSetpoint(-45));
//
//		SmartDashboard.putData("Open Claw", new OpenClaw());
//		SmartDashboard.putData("Close Claw", new CloseClaw());
//
//		SmartDashboard.putData("Deliver Soda", new Autonomous());
//
//		// Create some buttons
		JoystickButton intakeOut = new JoystickButton(m_joystick, 1);
		JoystickButton intakeIn = new JoystickButton(m_joystick, 2);

		JoystickButton gearUp = new JoystickButton(m_joystick, 3);
		JoystickButton gearDown = new JoystickButton(m_joystick, 4);

		JoystickButton climbUp = new JoystickButton(m_joystick, 5);
		JoystickButton climbDown = new JoystickButton(m_joystick, 6);
		
		JoystickButton DPadUp = new JoystickButton(m_joystick, 5);
		JoystickButton DPadDown = new JoystickButton(m_joystick, 5);
		JoystickButton DPadLeft = new JoystickButton(m_joystick, 5);
		JoystickButton DPadRight = new JoystickButton(m_joystick, 5);
		

//		JoystickButton dpadUp = new JoystickButton(m_joystick, 5);
//		JoystickButton dpadRight = new JoystickButton(m_joystick, 6);
//		JoystickButton dpadDown = new JoystickButton(m_joystick, 7);
//		JoystickButton dpadLeft = new JoystickButton(m_joystick, 8);
//		JoystickButton l2 = new JoystickButton(m_joystick, 9);
//		JoystickButton r2 = new JoystickButton(m_joystick, 10);
//		JoystickButton l1 = new JoystickButton(m_joystick, 11);
//		JoystickButton r1 = new JoystickButton(m_joystick, 12);
//
//		// Connect the buttons to commands
		intakeOut.whileHeld(new IntakeIn());
		intakeIn.whileHeld(new IntakeOut());

		gearUp.whenPressed(new DriveGearUp());
		gearDown.whenPressed(new DriveGearDown());

		climbUp.whileHeld(new ClimbUp());
		climbDown.whileHeld(new ClimbDown());
		
		DPadUp.whileHeld(new DriveTeleDPad());
		DPadDown.whileHeld(new DriveTeleDPad());
		DPadLeft.whileHeld(new DriveTeleDPad());
		DPadRight.whileHeld(new DriveTeleDPad());

//		dpadUp.whenPressed(new SetElevatorSetpoint(0.2));
//		dpadDown.whenPressed(new SetElevatorSetpoint(-0.2));
//		dpadRight.whenPressed(new CloseClaw());
//		dpadLeft.whenPressed(new OpenClaw());
//
//		r1.whenPressed(new PrepareToPickup());
//		r2.whenPressed(new Pickup());
//		l1.whenPressed(new Place());
//		l2.whenPressed(new Autonomous());
	}

	public Joystick getJoystick() {
		return m_joystick;
	}
}
