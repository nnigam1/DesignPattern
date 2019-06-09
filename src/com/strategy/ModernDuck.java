package com.strategy;

public class ModernDuck extends Duck {
	
	public ModernDuck() {
		super(new ComplexFly());
	}
	
}
