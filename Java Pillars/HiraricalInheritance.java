// 2 or more subclass inheting the properties of single super class is called Hierarchical inhertince 

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
class Parent extends School{
	String name="renu";
	int age=56;
	final String fathername="Malatesh";
	public void getDetails() {
		System.out.println(name);
		System.out.println(age);
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Parent std=new Parent();
		std.showdetails();
		std.getDetails();
		System.out.println("--------------------------------");
		Student p1=new Student();
		p1.updatedetails();
		p1.showdetails();
		
		System.out.println("Father name is " + std.fathername);
	}
}