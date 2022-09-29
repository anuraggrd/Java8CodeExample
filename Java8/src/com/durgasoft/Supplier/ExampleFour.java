package com.durgasoft.Supplier;

import java.util.function.Supplier;

public class ExampleFour {

	//  write a supplier to generate 8 digit passwod
	// odd places capital alphabet andspecialcharacters #_$@
	// in even place  digit are allowed
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> s1 = ()->
		{
			String pass= "";
			Supplier<Integer> d = ()->{
				
				int x = (int)(Math.random() * 10);
				return x;
			};
			
			
			String sysmbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$_";
			
			Supplier<Character> c = ()->
			{
				char ch;
				int y  = (int)(Math.random() * 29);
				
				ch = sysmbol.charAt(y);
				
				return ch;
			};
			
			for(int i=0;i<8;i++)
			{
				pass = i%2==0? pass+d.get():pass+c.get();
			}
			
			
			return pass;
		};
		
		System.out.println("Password : "+s1.get());
		System.out.println("Password : "+s1.get());
		System.out.println("Password : "+s1.get());
		System.out.println("Password : "+s1.get());
		System.out.println("Password : "+s1.get());
		
	}

}
