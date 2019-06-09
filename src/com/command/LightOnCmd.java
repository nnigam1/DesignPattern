package com.command;

public class LightOnCmd implements Command {
	Light l;
	
	public LightOnCmd(Light light) {
		// TODO Auto-generated constructor stub
		this.l = light;
	}
	public void execute()
	{
		l.on();
	}
}
