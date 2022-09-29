package com.durgasoft.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
	private String userName;
	private String password;

	User(String userName, String Password) {
		this.userName = userName;
		this.password = Password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
public class ExampleSix {
	
	public static void main(String args[])
	{
		try (Scanner src = new Scanner(System.in)) {
			System.out.println("Enter user Name");
			String name =  src.next();
			System.out.println("Enter Password");
			String password =  src.next();
			User userx = new User(name,password);
			Predicate<User>p = user -> user.getUserName().equals("anurag") && user.getPassword().equals("anurag@1"); 
			
			
			if(p.test(userx))
			{
				System.out.println("Welcome in the IRCTC App");
			}else
			{
				System.out.println("Invalid user");
			}
		}
		
	}

}
