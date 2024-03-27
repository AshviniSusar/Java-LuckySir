package com.Constructor;

public class demo {
	String name;
	int age;

	public demo() {
		name = "rahul";
		age = 20;
		System.out.println(name + " " + age);
	}

//there are three types of constructor
//1.argument constructor
//2.parameterized constructor
//3.default constructor

//parameterized  
	public demo(String name2, int age2) {
		name = name2;
		age = age2;
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		demo obj = new demo();
		demo obj1 = new demo("ramesh", 23);
	}
}
