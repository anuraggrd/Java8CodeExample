package com.durgasoft.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

// create student Object using BiFunction interface
 
class Student
{
	String name;
	int rollno ;
	Student(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	

}


public class ExampleTwo {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> sl = new ArrayList<>();
		BiFunction<String,Integer,Student> f = (i1,i2) -> new Student(i1,i2);
		
		sl.add(f.apply("Anurag",101));
		sl.add(f.apply("Karan",201));
		sl.add(f.apply("Ritik",301));
		sl.add(f.apply("Gautam" ,401));
		sl.add(f.apply("Rahul",501));
 		
		System.out.println(sl);
	}

}
