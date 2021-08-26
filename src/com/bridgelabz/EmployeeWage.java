package com.bridgelabz;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME= 2;
	public static final int NUM_OF_WORKING_DAYS =2;
	int empcheck;
	
	public void attendence()
	{
	  empcheck = (int) Math.floor(Math.random() * 10) %3;
   
	if (empcheck == IS_FULL_TIME)
	System.out.println("Employee Is Present");
	else
	{
		System.out.println("Employee Is Absent");
	}	
	}
     public void empdaily() 
     {
   
	  int IS_RATE_PER_HOUR =20;
     int emphr= 0;
     int empwage = 0,totalempwage =0;
  //   switch (empcheck) {
     for(int day =0; day < NUM_OF_WORKING_DAYS; day++) {
     switch (empcheck) {
     case IS_PART_TIME:
		emphr = 4;
		break;
     case IS_FULL_TIME:
		emphr=8;
		break;
	 default:
		emphr=0;
	}
	empwage = emphr * IS_RATE_PER_HOUR;
    totalempwage += empwage;
	System.out.println("Emp wage :"+empwage);
     }
     System.out.println("Total Emp Wage :"+totalempwage);
	}

	public static void main(String[] args) {
		 EmployeeWage obj = new EmployeeWage();
		 obj.attendence();
         obj.empdaily();
      
	}

}
