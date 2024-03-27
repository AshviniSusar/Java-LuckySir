package javabasics;

public class operatordemo {

	public static void main(String[]args) {
		
	int a=10;
	int b=20;
	System.out.println(a+b);
	//OR
	//int c= a+b;
	//System.out.println(c);
	
	int c=a+b;
	System.out.println(c+"  "+"hello");
	
	int k=30;
	int j=7;
	System.out.println(k/j);
	
	
	double d=(double)k/(double)j;
	System.out.println(d);
	
	
	//increment and decrement
	//increment--++     _____plus 1
	// pre increment
	int x=5;
	System.out.println(++x);
	System.out.println(x);
	
	
	//post increment 
	int y=5;
	System.out.println(y++);
	System.out.println(y);
	
	int s=5;
	System.out.println(++s+s);
	System.out.println(s);
	
	int u=5;
	System.out.println(--u-u);
	System.out.println(u);
	
	int ab=5;
	System.out.println(ab---ab);
	System.out.println(ab);
	
	//modulus
	// % this is the sign of modulus
	int cd=29;
	int dc=10;
	System.out.println(cd%dc);
	
	int cv=10;
	int db=39;
	System.out.println(cv%db);
	//if upper value is small then smaller value will always the answer
	
	
	
	//assignment operator
	//comparison operator
	// < , > , >= , <= , == , !=
	
	/*int i=10;
	System.out.println(i<10);
	System.out.println(i>10);
	System.out.println(i<=10);
	System.out.println(i>=10);
	System.out.println(i==10);
	System.out.println(i!=10);*/
	
	int i=11;
	System.out.println(i<10);
	System.out.println(i>10);
	System.out.println(i<=10);
	System.out.println(i>=10);
	System.out.println(i==10);
	System.out.println(i!=10);
	
	
	//logical
	//AND  //OR  //NOT
	//&&   //|| 
	//AND =if both the conditions are true then it will return true
	//OR  =if either one of the condition is true then it will return true
	//NOT =it will reverse the result
	
	
	int t= 20;
	System.out.println(t<10&&t>=20);
	System.out.println(t<10||t>20);
	System.out.println(!(t<10||t>20));
	
	
	
	
	
	
		
		
		
	}
	
	
}
