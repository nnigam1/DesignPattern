package com.command;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light lgt = new Light();
		Stereo str = new Stereo();
		RemoteControl rc = new RemoteControl();
		
		// we can change command dynamically
		rc.setCommand(new LightOnCmd(lgt));
		rc.buttonPressed();
		rc.setCommand(new StereoOnCmd(str));
		rc.buttonPressed();
		rc.setCommand(new StereoOffCmd(str));
		rc.buttonPressed();
	}

}
