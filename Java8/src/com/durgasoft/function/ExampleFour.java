package com.durgasoft.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

// write a program to find the grade of the students using function of java8 print only failed students
class Student{
	
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return name + ":" +marks;
	}
	
}

public class ExampleFour {
	
	public static ArrayList<Student> populate()
	{
		ArrayList<Student> sl = new ArrayList<>();
		
		sl.add(new Student("Anurag",97));
		sl.add(new Student("Rahul",77));
		sl.add(new Student("Karan",32));
		sl.add(new Student("Santish",66));
		sl.add(new Student("kunal",34));
		sl.add(new Student("kartik",51));
		
		
		return sl;
		
	}
	
	public static void main(String args[])
	{
		ArrayList<Student> list = populate();
		
		Function<Student,String> f = stu -> {
			int marks = stu.marks;
			if(marks >80)
			{
				return "A";
			}else if(marks>60)
			{
				return "B";
				
			}else if(marks>35)
			{
				return "C";
			}else
			{
				return "fail";
			}
		}; 
		
		Predicate<Student> p = stu -> stu.marks<35;
		
		
		for(Student stu : list)
		{
			if(p.test(stu)) {
				
			System.out.println(stu);
			System.out.println("Grade "+f.apply(stu));
			System.out.println();
			}
		}
 	}
	

}
