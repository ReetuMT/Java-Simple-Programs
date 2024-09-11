// Single Inheritance is the one sub class inherting the another super class 

// package com.employee;


class School{
	String name="rit";
	int age=25;
	public void showdetails() { 
		System.out.println(name);
		System.out.println(age);
	}
}
class Student extends School{
	String name="kirti";
	int age=18;
	public void updatedetails() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Student std=new Student();
		std.updatedetails();
		std.showdetails();
	}
}