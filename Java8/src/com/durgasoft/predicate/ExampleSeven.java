package com.durgasoft.predicate;

import java.util.function.Predicate;

class SoftwareEng
{
	private String name;
	private int age;
	private boolean isgf;

	public SoftwareEng(String name, int age, boolean isgf) {
		super();
		this.name = name;
		this.age = age;
		this.isgf = isgf;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsgf() {
		return isgf;
	}

	public void setIsgf(boolean isgf) {
		this.isgf = isgf;
	}
	
	
	
}
public class ExampleSeven {
	
public static void main(String args[])
{
	SoftwareEng []list = {
			new SoftwareEng("Rahul",18,false),
			new SoftwareEng("Satish",19,true),
			new SoftwareEng("Sourav",17,true),
			new SoftwareEng("Kunal",26,true),
			new SoftwareEng("Keshav",29,true),
			new SoftwareEng("Ayush",21,false),
			new SoftwareEng("Amit",20,false),
	};
	
	Predicate<SoftwareEng> allowed = eng -> eng.getAge()>=18 && eng.isIsgf()==true;
	
	
	for(SoftwareEng x : list)
	{
		if(allowed.test(x))
		{
			System.out.println(x);
		}
	}
}
}
