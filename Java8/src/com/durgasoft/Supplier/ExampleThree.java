package com.durgasoft.Supplier;

import java.util.function.Supplier;

public class ExampleThree {

	// write a programm to generate 6 digit otp
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Supplier<String> s = () ->
		{
			String otp = "";
			for(int i=0;i<6;i++)
			{
				double random = Math.random();
				//System.out.println(random);
				otp = otp + (int)(random * 10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		
		
		
		
	}

}
