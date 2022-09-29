package com.durgasoft.BiFunction;

import java.util.function.BiFunction;

class Employee
{
	int empno;
	String name;
	double dailyWage;
	
	public Employee(int empno, String name, double dailyWage) {
	
		this.empno = empno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
	
}

class TimeSheet{
	int empno;
	int noOfWorkingDays;

	public TimeSheet(int empno, int noOfWorkingDays) {
	
		this.empno = empno;
		this.noOfWorkingDays = noOfWorkingDays;
	}
	
	
}
public class ExampleThree {

	public static void main(String[] args) {

		Employee e = new Employee(101,"Anurag",150);
		TimeSheet ts = new TimeSheet(101,25);

		BiFunction<Employee,TimeSheet,Double> f = (i1,i2) -> i1.dailyWage * i2.noOfWorkingDays;
		System.out.println(f.apply(e,ts));
		
	}

}
