package com.mycomp.service;

import java.util.Random;

public class EmailPwdGenerator {
	
	//Template to generate email - FirstNameLastName@dept.comp.com
	
	/** 
	 * Returns EmailID based on FirstName, LastName and Dept
	 * @param - FirstName of Employee
	 * @param - LastName of Employee
	 * @param - Dept of Employee
	 * @return - Email id of employee based on dept 
	 */

	
	public String generateEmail(String firstName, String lastName, String deptName) 
	{
		String emailID;
		
		emailID=firstName + lastName + "@" + deptName + ".mycomp.com"; 
		
		return emailID;
		
	}
	
	//Generate Password
	
	/** 
	 * returns randomly generated Password
	 * @return - Randomly generated password with array of chars 
	 *  
	 */
	
	public char[] generateRandomPassword()
	{	
	
		String allowedPwdChars = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%");
		
		int length = 10;

		Random random = new Random();
	
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
	
			int randomIndex= random.nextInt(allowedPwdChars.length());
			password[i] = allowedPwdChars.charAt(randomIndex);
			
		}
		
		return password;
	}
	
	//showCredentials 
	//Dear Manish, your generated credentials are as follows
	//Email ---->
	//Password ---->
	
	public void displayInfo(String firstName, String emailID, char[] password)  {	
		
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email ------>   " + emailID);
		System.out.println("Password ------>   " + new String(password));
	}
}
