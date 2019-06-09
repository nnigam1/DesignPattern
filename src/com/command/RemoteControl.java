package com.command;

public class RemoteControl {
	Command cmd;
	
	public void setCommand(Command c)
	{
		this.cmd = c;
	}
	
	public void buttonPressed()
	{
		this.cmd.execute();
	}
	
}
