package com.strategy;

public class Duck {
	private FlyBehaviour fb;
	
	public Duck(FlyBehaviour fb) {
		this.fb = fb;
	}
	
	public void letsFly() {
		this.fb.fly();
	}
}

