package com.command;

public class StereoOnCmd implements Command {
	Stereo st;
	
	public StereoOnCmd(Stereo str) {
		// TODO Auto-generated constructor stub
		this.st = str;
	}
	public void execute()
	{
		st.on();
	}
}