package com.bridgelabz;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME= 2;
	
	public static int computeEmpWage (String company,int empRatePerHour, int numOfWorkingDay ,int maxHourPerMonth)
	{
		//variables
				int empHrs =0, totalemphr=0, totalworkingdays=0 ;
			
		  int empwage = 0,totalempwage=0, totalEmphrs=0 ;
		  {
		  while (totalEmphrs <= maxHourPerMonth && totalworkingdays < numOfWorkingDay) {
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
			int totalEmpWage = totalEmphrs * empRatePerHour;
		     System.out.println("Total Emp Wage for company  :" + company+"is :" +totalEmpWage);	
		     return totalempwage ;}
         }
		  public static void main(String[] args) {
		 computeEmpWage("Dmart",20,2,10);
         computeEmpWage("Reliance", 10,4,20);     
    }
}

