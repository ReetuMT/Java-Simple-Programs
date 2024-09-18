// Encapsulation is used to provide the security for data members against a invalid values.
// Declaring the data members are the private and grant the access through getter and setter methods

package com.jsp.encapsulation;

public class Login {
	private String email="ritreetu642@gmail.com";
	private String password="5328957";
	public String getMail() {
		return email;
	}
	public String getpassword() {
		return password;
	}
	
	public void setMail(String email) {
		this.email=email;
	}
	public void setpassword(String password) {
		this.password=password;
	}
	
	public static void main(String[] args) {
		Login l1=new Login();
		System.out.println("Current email");
		System.out.println(l1.getMail());
		System.out.println("Current Password");
		System.out.println(l1.getpassword());
		System.out.println("Updated Password");
		l1.setpassword("12346");
		System.out.println(l1.getpassword());
	}

}
