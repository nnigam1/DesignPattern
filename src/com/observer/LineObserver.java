package com.observer;

public class LineObserver implements Observer {

	private SubjectObservable obs;
	private double val;
	
	public LineObserver(SubjectObservable ob) {
		// TODO Auto-generated constructor stub
		this.obs = ob;
		val =10.0;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		val = obs.getValue();
		System.out.print("i am line observer i got notified for a value change " );
		display();
	}
	
	public void display()
	{
		System.out.println(this.val);
	}
	
}
