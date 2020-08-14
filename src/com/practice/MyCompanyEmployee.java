package com.practice;

public abstract class MyCompanyEmployee {

	private String name;
	private int hourlyWorkingPayment;
	private int extraHourlyWorkingPayment;

	public MyCompanyEmployee(String name, int hourlyWorkingPayment, int extraHourlyWorkingPayment) {
		super();
		this.name = name;
		this.hourlyWorkingPayment = hourlyWorkingPayment;
		this.extraHourlyWorkingPayment = extraHourlyWorkingPayment;
		
		

	}
	
	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourlyWorkingPayment() {
		return hourlyWorkingPayment;
	}

	public void setHourlyWorkingPayment(int hourlyWorkingPayment) {
		this.hourlyWorkingPayment = hourlyWorkingPayment;
	}

	public int getExtraHourlyWorkingPayment() {
		return extraHourlyWorkingPayment;
	}

	public void setExtraHourlyWorkingPayment(int extraHourlyWorkingPayment) {
		this.extraHourlyWorkingPayment = extraHourlyWorkingPayment;
	}
}
