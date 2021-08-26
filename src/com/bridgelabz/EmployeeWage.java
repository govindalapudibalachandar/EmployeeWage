package com.bridgelabz;

public class EmployeeWage {
	
	int IS_FULL_TIME=1;
	//int  IS_PART_TIME= 2;	
	double empcheck;
	
	public void attendence()
	{
	//int IS_FULL_TIME=1;

	 empcheck = Math.floor(Math.random() * 10) %3;
   
	if (empcheck == IS_FULL_TIME)
	
	System.out.println("Employee Is Present");
	
	else
	{
		System.out.println("Employee Is Absent");
	}
	
	}
     public void empdaily() 
     {
     int IS_PART_TIME= 2;	 
	  int IS_RATE_PER_HOUR =20;
     int emphr= 0;
     int empwage = 0;
     
	if(empcheck == IS_PART_TIME)
	{
		emphr = 4;
	}
	else if(empcheck == IS_FULL_TIME)
	{
		emphr=8;
		}
	else
	{
			emphr=0;
	}
	empwage = emphr * IS_RATE_PER_HOUR;
	System.out.println("Emp wage :"+empwage);
	}

	public static void main(String[] args) {
		 EmployeeWage obj = new EmployeeWage();
		 obj.attendence();
	   //  EmployeeWage obj1 = new EmployeeWage();
         obj.empdaily();
      
	}

}
