// Subclass inheting the propertis of Super class and that super calss inherting the propertis from the anotehr super class is called Multi level ingeritance

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
class Parent extends Student{
	String name="renu";
	int age=56;
	final String fathername="Malatesh";
	public void getDetails() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Parent std=new Parent();
		std.updatedetails();
		std.showdetails();
		std.getDetails();
		System.out.println("Father name is " + std.fathername);
	}
}