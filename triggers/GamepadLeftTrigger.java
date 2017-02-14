package org.usfirst.frc.team3467.robot.triggers;

import org.usfirst.frc.team3467.robot.control.Gamepad;

import edu.wpi.first.wpilibj.GamepadBase;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class GamepadLeftTrigger extends Trigger {
    
	Gamepad m_gamepad;
	public GamepadLeftTrigger(Gamepad gamepad) {
		this.m_gamepad = gamepad;
	}	

    public boolean get() {
    		boolean leftTrigger = false;
    		if(m_gamepad.getRawAxis(Gamepad.leftTrigger_Axis) > .8 ){
    			leftTrigger = true;
    		}
    		else{
    			leftTrigger = false;
    		}
    		return leftTrigger;
    }
}
