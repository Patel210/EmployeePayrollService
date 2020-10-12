package com.practice.employeepayrollservice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EmployeePayrollFileIOService {
	private static String PAYROLL_FILE_NAME = "payroll-file.txt";

	/**
	 * Writes Employee payroll Data object to a file
	 */
	public void writeData(ArrayList<EmployeePayrollData> employeePayrollDataList) {
		StringBuffer employeeBuffer = new StringBuffer();
		employeePayrollDataList.forEach(employee -> {
			String employeeString = employee.toString().concat("\n");
			employeeBuffer.append(employeeString);
		});

		try {
			Files.write(Paths.get(PAYROLL_FILE_NAME), employeeBuffer.toString().getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Counts the entries in a file
	 */
	public long countEntries() {
		long entries = 0;
		try {
			entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}
}
