package com.jsp.arrays;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

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
		return "My name is " +  name + " ,Im studying in " + std + " , usn number is " + usnid ;
	}

	@Override
	public int compareTo(Employee o) {
		return this.usnid - o.usnid;
	}
	
	
	public static void main(String[] args) {
		Employee e1= new Employee("Reetu","BE",101);
		Employee e2= new Employee("Renu","Bca",1000);
		Employee e3= new Employee("Keerthi","BBA",9002);
		TreeSet<Employee> t1=new TreeSet<Employee>();
		t1.add(e3);
		t1.add(e1);
		t1.add(e2);
		Iterator<Employee> i1=t1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
//		System.out.println(t1);
		
	}
	}
		
