package com.exceptions;

public class tryCatchBlock {
public static void main(String args[]) {
	try {
		int a[] = {10,20,30,40};
	System.out.println(a[6]);
}
 catch
 (Exception e) {
	//to handle the exception
	System.out.println("Please try to access value within the range");
}
System.out.println("hello");
}
}
