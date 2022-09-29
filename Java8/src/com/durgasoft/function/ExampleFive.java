package com.durgasoft.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

// write a programe to increment the salary of employee whos salary is less than 3500 by 477



class Employee
{
	
	String name;
	double salary;
	
	Employee(String name,double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "("+name +" : "+ salary +")";
	}
}

public class ExampleFive {

	public static ArrayList<Employee>populate()
	{
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee("Rahul",52000));
		al.add(new Employee("Kunal",16000));
		al.add(new Employee("Kartik",22000));
		al.add(new Employee("Ajay",65000));
		al.add(new Employee("Akash",50000));
		al.add(new Employee("Karan",33000));
		
		return al;
		
	}
	
	
	public static void main (String args[])
	{
		ArrayList<Employee> list = populate();
		Predicate<Employee> p = emp -> emp.salary<35000;
		Function<ArrayList<Employee>,ArrayList<Employee>> f = emp ->
			{
				for(Employee e : emp)
				{
					if(p.test(e))
					{
						
						 e.setSalary(e.getSalary()+477);
					}
				}
					return emp;
			};
			
			System.out.println("Salary before increment");
			System.out.println(list);
			f.apply(list);
			System.out.println("Salary after increment");
			System.out.println(list);
			
				
	}
}
