package com.bridgelabz;

public class EmployeeWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int  IS_PART_TIME= 2;
	
	private final String company ;
	private final int empRatePerHour;
	private final int numOfWorkingDay;
	private final int maxHourPerMonth;
	private int totalEmpWage;
	public EmployeeWage(String company,int empRatePerHour,int numOfWorkingDay,int maxHourPerMonth) {
	 
		this.company = company ;
		this.empRatePerHour = empRatePerHour ;
		this.numOfWorkingDay = numOfWorkingDay ;
		this.maxHourPerMonth = maxHourPerMonth ;
	}
	public void computeEmpWage ()
	{
		//variables
				int empHrs =0, totalEmphrs=0, totalworkingdays=0,totalempwage =0;
			
     	 // int empwage = 0, totalEmphrs=0  ;
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
		  }
	}
		// @Override
		 public String tostring()
		  {
		  
		     return "Total Emp Wage for company  :" +company+ "is :"+ totalEmpWage;	
		  }

		  public static void main(String[] args) {
		 EmployeeWage dMart = new EmployeeWage ("Dmart",20,2,10);
         EmployeeWage reliance = new EmployeeWage ("Reliance", 10,4,20);     
         dMart.computeEmpWage();
         System.out.println(dMart);
         reliance.computeEmpWage();
         System.out.println(reliance);
    }
}

 