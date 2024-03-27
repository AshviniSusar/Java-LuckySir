package arraysDemo;

import java.util.Arrays;

public class TwoDimensionalArray {
	public static void main(String[]args) {
                 //0th array   //1st Array
	int a[][]= {{10,20,30,40},{50,60,70,80}};
	//find out the length
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[1].length);
	System.out.println((a[0].length)+(a[1].length));
	
	//access the value of specifix index
	System.out.println(a[0][3]);
	System.out.println(a[1][0]);
	
	//or
	
	System.out.println(a[1][2]);
	
	//update or modify the value
	a[0][1]=55;
	System.out.println(a[0][1]);
	//first way
	System.out.println(Arrays.toString(a[0])+Arrays.toString(a[1]));
	
	//second way
	//using for loop
	//int a[][]={{10,20,30,40},{50,60,70,80}};
	for(int i=0;i<a.length;i++) {
		System.out.println(Arrays.toString(a[i]));
	}
	
}
}

