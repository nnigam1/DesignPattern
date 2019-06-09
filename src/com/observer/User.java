package com.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SubjectObservable sub = new SubjectObservable();
		FeedObserver fd = new FeedObserver(sub);
		LineObserver ld = new LineObserver(sub);
		sub.add(fd);
		sub.add(ld);
		System.out.println("Enter value to update");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    sub.setValue(Double.parseDouble(br.readLine()));
	    System.out.println("\n Thankyou :) \n");
	}
}
