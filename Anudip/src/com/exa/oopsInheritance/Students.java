package com.exa.oopsInheritance;

public class Students {

	String stdName ;
	int age;
	String  address;
	int marks;
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(String stdName, int age, String address, int marks) {
		super();
		this.stdName = stdName;
		this.age = age;
		this.address = address;
		this.marks = marks;
	}
	


	@Override
	public String toString() {
		return "Students [stdName=" + stdName + ", age=" + age + ", address=" + address + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students std1 = new Students("omkar",18,"Pune",89);
		Students std2 = new Students("shyam",19,"Pune",85);
		Students std3 = new Students("madhav",20,"Pune",80);
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		
	}

}
