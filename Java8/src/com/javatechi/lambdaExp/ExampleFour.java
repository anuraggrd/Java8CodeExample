package com.javatechi.lambdaExp;

interface CalculatorFour
{
	int substract(int i,int j);
}
public class ExampleFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFour cal = (i1,i2) ->{
			
			if(i2<i1)
			{
				throw new RuntimeException("I2 is Less than I1");
			}else
			{
				return i2 -i1;
			}
		};
		
		cal.substract(4,3);
	}

}
