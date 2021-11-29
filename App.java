package com.email.main;

import java.util.Scanner;

import com.email.bean.Employee;
import com.email.service.CredentialService;

public class App {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
 System.out.println("Enter The First Name");
 String firstName = sc.next();
 System.out.println("Enter The Last Name");
 String lastName = sc.next();
 System.out.println("Please Enter The Department From The Following Options");
 System.out.println("1:Technical");
 System.out.println("2:Admin");
 System.out.println("3:Human Resource");
 System.out.println("4:Legal");
 int ch = sc.nextInt(); 
 Employee emp;
 switch(ch) {
 case 1 : emp = new Employee(firstName, lastName, "technical");
         break;
 case 2 : emp = new Employee(firstName, lastName, "admin");
         break;
 case 3 : emp = new Employee(firstName, lastName, "humanresource");
         break;
 case 4 : emp = new Employee(firstName, lastName, "legal");
         break;
    default:System.out.println("Invalid Option");  
    return;
 }
	CredentialService cs= new CredentialService();
String emailId = cs.generateEmailId(emp);
//System.out.println("Your Email Id is " +emailId);
String password = cs.generatePassword();
//System.out.println("Your Password is "+password);
System.out.println("Wait for few Seconds its generating......");
Thread.sleep(2000);
cs.showCredentials(emp, emailId, password);
	}
}
