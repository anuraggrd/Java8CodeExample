package com.javatechi.lambdaExp;

interface Calculator{ // This is functional interface 
	
	public void switchOn();
}
public class ExampleOne {

	public static void main(String[] args) {

		Calculator cal =	() ->{
			System.out.println("Calling Abstact Method");
		};
		
		cal.switchOn();
	}

}
