package Collections;

import java.util.HashSet;

public class HashSetDemo {
//duplicates are not allowed in hashset 
	//sequence is not fixed in hashset
	//set-interface
	//hashset-class
	public static void main(String[]args) {
		HashSet<Integer>obj=new HashSet<Integer>();//declare the arraylist
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.size()); //3
		obj.remove(10);
		System.out.println(obj);
		
		obj.remove(30);
		System.out.println(obj);
		
		for(int j:obj) {
			System.out.println(j);
		}
	}
}
