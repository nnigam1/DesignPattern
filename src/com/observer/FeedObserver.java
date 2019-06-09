package com.observer;

public class FeedObserver implements Observer {

	private SubjectObservable obs;
	private double val;
	
	public FeedObserver(SubjectObservable ob) {
		// TODO Auto-generated constructor stub
		this.obs = ob;
		val =10.0;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		val = obs.getValue();
		System.out.print("i am feed observer i got notified for a value change ");
		display();
	}
	
	public void display()
	{
		System.out.println(this.val);
	}
	
}
