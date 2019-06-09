package com.command;

public class LightOffCmd implements Command {
	Light l;
	
	public LightOffCmd(Light light) {
		// TODO Auto-generated constructor stub
		this.l = light;
	}
	public void execute()
	{
		l.off();
	}
}