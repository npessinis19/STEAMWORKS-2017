package org.usfirst.frc3467.robot.control.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * Gamepad DPadUp support
 */
public class DPadUp extends Trigger {
	private Joystick joy;
	
	public DPadUp(Joystick joy) {
		this.joy = joy;
	}	

	public boolean get() {
        return (joy.getPOV(0) == 0);
    }
}
