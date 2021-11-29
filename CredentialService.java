package com.email.service;
import java.util.Random;

import com.email.bean.Employee;
public class CredentialService {
public String generateEmailId(Employee emp) {
	return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+emp.getDepartmentName().toLowerCase()+".dinetic"+".com";
}
public String generatePassword() {
	String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*";
//System.out.println("Length of Password Character"+passwordCharacters.length());
	char password[]=new char[8];
Random ran = new Random();
for(int i=0;i<8;i++) {
	int n=ran.nextInt(passwordCharacters.length());
// System.out.println(n+"-"+(char)n);
 password[i]=passwordCharacters.charAt(n);
}
return String.valueOf(password); //valueOf is static method which help to convert char array to String 
}
public void showCredentials(Employee emp,String emailId,String password) {
	System.out.println("Dear"+" "+emp.getFirstName()+" Your generated credentials are as follows: ");
	System.out.println("Email Id is "+emailId);
	System.out.println("Password is "+password);
}
}
