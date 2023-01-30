package com.employeeWage;

public class EmpWageForMonthUc5 {

	static int IS_PRESENT = 1;
	static int IS_PART_TIME = 2;
	static int WAGE_PER_HOUR = 20;
	static int FULL_TIME = 8;
	static int PART_TIME = 4;
	static int empWage = 0;

	public static void main(String[] args) {

		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("empCheck=> " + empCheck);

		switch (empCheck) {
		case 1:
			System.out.println("Employee is present");
			empWage = WAGE_PER_HOUR * FULL_TIME;
			break;

		case 2:
			System.out.println("Employee working as part time");
			empWage = WAGE_PER_HOUR * PART_TIME;
			break;

		default:
			System.out.println("Employee is absent");
			empWage = 0;

		}
		System.out.println("Employee wage = " + empWage);
	}

}
