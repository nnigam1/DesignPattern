package com.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectObservable implements Observable {
	private double value;
	List<Observer> lst = new ArrayList<>();
	@Override
	public void add(Observer ob) {
		lst.add(ob);
	}

	@Override
	public void remove(Observer ob) {
		// TODO Auto-generated method stub
		lst.remove(ob);
	}

	@Override
	public void notified() {
		// TODO Auto-generated method stub
		for( Observer temp : lst)
		{
			temp.update();
		}
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		notified();
	}

}
