package Collections;

import java.util.LinkedHashSet;

public class LinkedHashDemo {
//interface--set
	//class--linkedhashset
	public static void main(String args[]) {
		LinkedHashSet<Integer> obj = new LinkedHashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(10);
		System.out.print(obj);
	}
	
}
