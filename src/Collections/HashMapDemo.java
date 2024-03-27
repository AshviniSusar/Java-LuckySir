package Collections;

import java.util.HashMap;

public class HashMapDemo {
  //Map--interface
	//HashMap--class
	//duplicates are not allowed
	//sequence is not fixed
	public static void main(String[]args) {
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("MH","Mumbai");
		obj.put("KR","BLR");
		obj.put("GJ","Gandhinagar");
		obj.put("MH","Mumbai");
		System.out.println(obj);
	}
}
