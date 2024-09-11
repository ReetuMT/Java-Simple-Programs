package com.jsp.arrays;
public class Employee {
	String name;
	String std;
	int usnid;
	public Employee(String name,String std,int usnid) {
//		super();
		this.name=name;
		this.std=std;
		this.usnid=usnid;
	}
	public String toString() {
		return "My name is " +  name + " ,Im studying in " + std + " , usn number is " + usnid ;
	}
	}
		
