package com.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

	public static void main(String... args) throws NumberFormatException, IOException {
		System.out.println("Print 1. Normal Duck \n 2. Modern Duck");
		
		Duck d = null;
		int x =0;
		while( x!=3)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			x = Integer.parseInt(br.readLine());
			switch(x)
			{
			case 1:
				d = new NormalDuck();
				break;
			case 2:
				d =  new ModernDuck();
				break;
			default:
				System.out.println("get out");
				d=null;
				break;
			}
			if( null != d)
			{
				d.letsFly();
			}
		}
		System.err.println("\n Thankyou !!! See you again");
	}
}
