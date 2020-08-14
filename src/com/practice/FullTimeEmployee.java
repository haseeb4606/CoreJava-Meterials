package com.practice;

public class FullTimeEmployee extends MyCompanyEmployee {

	int hourlyWorking;

	public FullTimeEmployee(String name, int hourlyWorkingPayment, int extraHourlyWorkingPayment, int hourlyWorking) {
		super(name, hourlyWorkingPayment, extraHourlyWorkingPayment);

		this.hourlyWorking = hourlyWorking;
	}

	public int calculateSalary() {
		return getHourlyWorkingPayment() * 8;
	}

	public String toString() {
		return "name " + getName() + "\nHourly Working "+ hourlyWorking + "\n Hourly Working Payment" +" " + getHourlyWorkingPayment()+ "\nExtra Hourly Working Payment "+ " "+getExtraHourlyWorkingPayment()+ "\n total payment " + calculateSalary();
	}

	public static void main(String[] args) {

		FullTimeEmployee obj = new FullTimeEmployee("Hasib", 40, 0, 8);

		
		System.out.println(obj);
	}


}
