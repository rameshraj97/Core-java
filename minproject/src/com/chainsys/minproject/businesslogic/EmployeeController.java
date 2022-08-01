package com.chainsys.minproject.businesslogic;

import com.chainsys.minproject.commonutil.InvalidInputDataException;
import com.chainsys.minproject.commonutil.Validator;
import com.chainsys.minproject.dao.EmployeeDao;
import com.chainsys.minproject.pojo.Employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EmployeeController {
	public   void addNewEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmp_d(empId);
			System.out.println("Enter First_Name:");
			String fName = sc.nextLine();
			try {
				Validator.CheckStringForFirstName(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkStringOnly(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirstName(fName);
			System.out.println("Enter Last_Name :");
			String lName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkStringOnly(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setLast_name(lName);
			System.out.println("Enter Email :");
			String eMail = sc.nextLine();
			try {
				Validator.(eMail);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmail(eMail);
			System.out.println("Enter Phone Number :");
			String num =sc.nextLine();
			try {
				Validator.checkStringForParseInt(num);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkPhoneNumberLessThanTenDigits(num);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setPhone_number(num);
          //------------------------------------------------
			System.out.println("Enter Date :");
			 String dateFormat = "dd/MM/yyyy";
			  
			    try {
					newemp.setHire_date(new SimpleDateFormat(dateFormat).parse(sc.nextLine()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			/*   try {
					Validator.checkDateIsValid(dateFormat);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;   
				}    */
			/*   try {
					Validator.checkMonthIsValid(dateFormat);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}     */
          //---------------------------------------------------
			System.out.println("Enter Job_id :");
			String jobId = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setJob_id(jobId);
			System.out.println("Enter Salary :");
			float salary = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				
				Validator.CheckNumberForGreaterThanZero((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSalaryOnlyNumbers((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salary);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			int result = dao1.insertEmployee(newemp);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public   void updateEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId);
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter First_Name to Modify:");
			String fName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);
			System.out.println("Enter Last_Name to Modify:");
			String lName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(lName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setLast_name(lName);
			System.out.println("Enter Email to Modify:");
			String eMail = sc.nextLine();
			try {
				Validator.checkMailContainsAtsymbol(eMail);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setEmail(eMail);
			System.out.println("Enter Phone Number :");
			String num =sc.nextLine();
			try {
				Validator.checkStringForParseInt(num);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkPhoneNumberLessThanTenDigits(num);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setPhone_number(num);
          //------------------------------------------------
			System.out.println("Enter Date :");
			 String dateFormat = "dd/MM/yyyy";
			    try {
					newemp.setHire_date(new SimpleDateFormat(dateFormat).parse(sc.nextLine()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			/*    try {
					Validator.checkDateIsValid(dateFormat);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}  */
			System.out.println("Enter Job_id to Modify:");
			String jobId = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(jobId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setJob_id(jobId);
			System.out.println("Enter Salary to Modify:");
			float salary = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.CheckNumberForGreaterThanZero((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSalaryOnlyNumbers((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salary);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			int result = dao1.updateEmployee(newemp);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public   void updateEmployeeFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter Update Name :");
			String fName = sc.nextLine();
			try {
				Validator.checkCharLessThanTwenty(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkDataOnlyString(fName);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setFirst_name(fName);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			int result = dao1.updateEmployeeFirstName(empId, fName);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public   void updateEmployeeSalary() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			System.out.println("Enter Update salary :");
			float salary = sc.nextFloat();
			try {
				Validator.checkSalaryLessThanTenDigit(salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int sl =(int) salary;
			//int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero((int) salary);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			try {
				Validator.checkSalaryOnlyNumbers(sl);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newemp.setSalary(salary);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			int result = dao1.updateEmployeeSalary(empId, salary);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public   void deleteEmployee() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			int result = dao1.deleteEmployee(empId);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public   void getEmployeeById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Employee newemp = new Employee();
			System.out.println("Enter Employee Id :");
			String id = sc.nextLine();
			try {//
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee emp = dao.getEmployeeById(empId);
			if (emp == null) {
				System.out.println("Employee Doesn't Exist For Id " + empId); //
				return;
			}
			newemp.setEmp_id(empId);
			EmployeeDao dao1 = new EmployeeDao(); // TODO: Use Spring getBean() here
			Employee result = dao1.getEmployeeById(empId);
			System.out.println(result.getEmp_id() + " " + result.getFirst_name() + " " + result.getLast_name() + " "
					+ result.getEmail() + " " + result.getHire_date() + " " + result.getJob_id() + " "
					+ result.getSalary());
		} finally {
			sc.close();
		}
	}

	public   void getAllEmployeesDetails() {
		EmployeeDao dao = new EmployeeDao(); // TODO: Use Spring getBean() here
		List<Employee> allEmployees = dao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp.getEmp_id() + " " + emp.getFirst_name() + " " + emp.getLast_name() + " "
					+ emp.getEmail() + " " + emp.getHire_date() + " " + emp.getJob_id() + " " + emp.getSalary());
		}
	}
}
