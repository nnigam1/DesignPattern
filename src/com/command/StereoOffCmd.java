package com.command;

public class StereoOffCmd implements Command {
	Stereo st;
	
	public StereoOffCmd(Stereo str) {
		// TODO Auto-generated constructor stub
		this.st = str;
	}
	public void execute()
	{
		st.off();
	}
}