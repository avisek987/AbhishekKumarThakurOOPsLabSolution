package com.email.bean;

public class Employee {
private String firstName;
private String lastName;
private String departmentName;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}

public Employee(String firstName, String lastName, String departmentName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.departmentName = departmentName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

}
