package com.javatechi.lambdaExp;

interface claculatorThree
{
 int substract(int a,int b);
}
public class ExampleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		claculatorThree cal = (i1,i2)-> i2-i1;
		
		int result = cal.substract(3,5);
		System.out.println(result);
	}

}
