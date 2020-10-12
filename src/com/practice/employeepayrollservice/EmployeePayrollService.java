package com.practice.employeepayrollservice;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

	private ArrayList<EmployeePayrollData> employeePayrollDataList;

	public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollDataList) {
		super();
		this.employeePayrollDataList = employeePayrollDataList;
	}

	public EmployeePayrollService() {
		this.employeePayrollDataList = new ArrayList<EmployeePayrollData>();
	}

	public void readEmployeeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee data\n\nEnter Employee name: ");
		String empName = sc.next();
		System.out.println("Enter the employee id:");
		long empId = sc.nextLong();
		System.out.println("Enter the employee salary:");
		long salary = sc.nextLong();
		employeePayrollDataList.add(new EmployeePayrollData(empId, empName, salary));
		sc.close();
	}

	public void writeEmployeeData() {
		employeePayrollDataList.forEach(System.out::println);
	}

	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.readEmployeeData();
		employeePayrollService.writeEmployeeData();
	}

}
