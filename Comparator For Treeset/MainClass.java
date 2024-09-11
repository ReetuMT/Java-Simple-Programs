package com.jsp.arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Employee e1= new Employee("Reetu","BE",101);
		Employee e2= new Employee("Renu","Bca",1000);
		Employee e3= new Employee("Keerthi","BBA",9002);
		SortByName s1=new SortByName();
		SortById s2=new SortById();
		TreeSet<Employee> t1=new TreeSet<Employee>(s1);
		t1.add(e3);
		t1.add(e1);
		t1.add(e2);
		Iterator<Employee> i1=t1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
//		System.out.println(t

	}

}
