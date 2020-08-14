package com.practice;

public class ContractorEmployee extends MyCompanyEmployee {
	
	public int hourlyWorking;
	public int extraHourlyWorking;

	public ContractorEmployee(String name, int hourlyWorkingPayment, int extraHourlyWorkingPayment,int hourlyWorking,int extraHourlyWorking) {
		super(name, hourlyWorkingPayment, extraHourlyWorkingPayment);
		
		this.hourlyWorking=hourlyWorking;
		this.extraHourlyWorking=extraHourlyWorking;
	}

	

	
	public int calculateSalary() {
		return getHourlyWorkingPayment() * extraHourlyWorking + getExtraHourlyWorkingPayment() * extraHourlyWorking;
	}
	
	public String toString() {
		
		return "Name: " + getName() + "\nHourly Working " + hourlyWorking + "\nHourly Working Payment " + getHourlyWorkingPayment() + "\nExtra Hourly Working " + extraHourlyWorking + "\nExtra Hourly working Payment " + getExtraHourlyWorkingPayment() + "\nTotal Payment " + calculateSalary();                               
		 
	}
	
	public static void main(String[] args) {
		
		 ContractorEmployee con = new ContractorEmployee("Hasib", 8, 2, 35, 20);
		 
		 System.out.println(con);
		
	}

}
