package com.bridgelabz;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int  IS_PART_TIME= 2;
	public static final int NUM_OF_WORKING_DAYS =2;
	public static final int MAX_HRS_IN_MONTH =10;
	int empcheck;
	
	public static int computeEmpWage(String company,int emprate, int numofdays, int maxhrs)
	{
		//variables
		int empHrs =0, totalemphr=0, totalworkingdays=0;
	
     int empwage = 0,totalempwage=0, totalEmphrs=0 ;{
  while (totalEmphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
	  totalworkingdays++;
	 int empcheck = (int) Math.floor(Math.random() * 10) %3;
     switch (empcheck) {
     case IS_PART_TIME:
		empHrs = 4;
		break;
     case IS_FULL_TIME:
		empHrs=8;
		break;
	 default:
		empHrs=0;
	}
     totalEmphrs += empHrs;
    System.out.println("Days# " + totalworkingdays +"Emp hr :"+empHrs );
  }
	int totalEmpWage =totalEmphrs * EMP_RATE_PER_HOUR;
    totalempwage += empwage;
	System.out.println("Emp wage :"+empwage);
     }
     System.out.println("Total Emp Wage :"+ company+ "is :"+ totalempwage);
     return totalempwage;
	}

	public static void main(String[] args) {
		computeEmpWage("Dmart",20,2,10);
		computeEmpWage("reliace",10,4,20); 
		}

}