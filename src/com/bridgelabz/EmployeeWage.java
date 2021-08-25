package com.bridgelabz;

public class EmployeeWage {
	
	int IS_FULL_TIME;
	
	public void attendence()
	{
	double empcheck = Math.floor(Math.random() * 10) %2;
	if (empcheck == IS_FULL_TIME)
	{
	System.out.println("Employee Is Present");
	}
	else
	{
		System.out.println("Employee Is Absent");
	}
	}

	public static void main(String[] args) {
		EmployeeWage obj = new EmployeeWage();
		obj.attendence();

	}

}
