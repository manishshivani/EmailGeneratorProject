package com.mycomp.driver;
import java.util.Scanner;

import com.mycom.model.Employee;
import com.mycomp.service.EmailPwdGenerator;

public class Empdriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Manish","Shivani");
		EmailPwdGenerator emailGen = new EmailPwdGenerator(); 
		String deptName=retrieveDeptName();
		String emailID=emailGen.generateEmail(emp1.getEmpFirstName().toLowerCase(), emp1.getEmpLastName().toLowerCase(), deptName);
		char[] password=emailGen.generateRandomPassword();	
		emailGen.displayInfo(emp1.getEmpFirstName(), emailID, password);
	}		
		public static String retrieveDeptName() { 	
		System.out.println("Please enter the department from following :");
		System.out.println("1=Technical"); 
		System.out.println("2=Admin");
		System.out.println("3=Human Resuorce");
		System.out.println("4=Legal");
		
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		String domainName;
		if (userChoice ==1)
		{
			domainName = "tech";
			
		}
		else if (userChoice ==2)
		{
			domainName = "adm";
		}
		else if (userChoice ==3)
		{
			domainName = "hr";
		}
		else 
		{
			domainName = "lg";
		}
		sc.close();
		return domainName;
	}

}
