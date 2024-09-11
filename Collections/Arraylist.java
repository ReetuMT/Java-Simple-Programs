package com.jsp.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
	private String name;
	private String std;
	private int usnid;
	public Employee(String name,String std,int usnid) {
		this.name=name;
		this.std=std;
		this.usnid=usnid;
	}
	public String getName() {
		return name;
	}
	public String getstd() {
		return std;
	}
	public int getUsnid() {
		return usnid;
	}
	public void setName(String names) {
		this.name=names;
	}
	public void setstd(String stdid) {
		this.std=stdid;
	}
	public void setUsnid(int usn) {
		this.usnid=usn;
	}
	public String toString() {
		return "My name is " +  name + " Im studying in " + std + " usn number is " + usnid ;
	}

	@Override
	public int compareTo(Employee o) {
		return this.usnid - o.usnid;
	}
	
	
	public static void main(String[] args) {
		Employee e1= new Employee("Reetu","BE",10001);
		Employee e2= new Employee("Renu","Bca",1000);
		Employee e3= new Employee("Keerthi","BBA",9002);
		ArrayList <Employee> emp=new ArrayList<Employee>();
		emp.add(e3);
		emp.add(null);
		emp.add(e3);
		emp.add(e2);
		emp.add(e1);
		for(int i=0;i<emp.size();i++) {
			System.out.println(emp.get(i));
		}
		
	}
	}
		