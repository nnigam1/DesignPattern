package com.strategy;

public class NormalDuck extends Duck {
	
	public NormalDuck() {
		super(new SimpleFly());
	}
	
}
