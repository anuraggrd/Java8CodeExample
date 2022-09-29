package com.javatechi.lambdaExp;

interface CalculatorTwo
{
	void sum(int a,int b);
	
}
public class ExampleTwo {

	public static void main(String[] args) {
		
		CalculatorTwo cal = ( a, b) -> System.out.println(a+b);

		cal.sum(12,45);
	}

}
