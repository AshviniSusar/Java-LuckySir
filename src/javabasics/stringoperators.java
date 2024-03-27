package javabasics;

public class stringoperators {
	public static void main (String[]args) {
		String a="hello i love java";
		System.out.println(a);
		System.out.println(a.length());
		
		
		System.out.println(a.length());   //length
		System.out.println(a.toLowerCase());  //uppercase
		System.out.println(a.toUpperCase());   //lowercase
		  //character at specific index
		System.out.println(a.charAt(6));
		
		
		
		//escape character or backslash character
		   // expected= hello i "love" java 
		 String h = "hello i 'love' java ";
		 System.out.println(h);
		 

		// expected= i love \ backslash character
		String e="i love \\backslash character";
		System.out.println(e);
		
		
		// expected= i love \\ character
		String p="i love \\\\character";
		System.out.println(p);
		
		
		// expected= i love @character
		String t="i love \\@character";
         System.out.println(t);
         
         
         String x ="hello";
         String y ="Hello";
         System.out.println(x.equals(y));
         System.out.println(x.equalsIgnoreCase(y));
		
		
		String b="hello java";
		String c="hello";
		System.out.println(c.contains(b));
		System.out.println(b.contains(c));
		
		
		String s="hello i love java";
		System.out.println(s.trim());
         
		
		//concatenation
		String ab="hello";
		String ac="java";
		System.out.println(ab+ac);
		
		String ad="hello";
		String af="java";
		System.out.println(ad+" "+ af);
		
		
		String v="hello java";
		System.out.println(v.replace("hello", "kello"));
		
	
         
	}

}
 