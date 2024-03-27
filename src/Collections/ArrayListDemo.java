package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[]args) {
	ArrayList<Integer> obj =new ArrayList<Integer>();
	//declare the arraylist
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	//first way
	System.out.println(obj);
	//10 20 30 10
	obj.add(1,12);
	//add the element at specifix index
	System.out.println(obj);
	//10 20 30 10
	System.out.println(obj.get(3));
	//access the element at specifix index
	//to remove the value of specific index
	obj.remove(1);
	System.out.println(obj);
	obj.set(2, 45);
	//replace the existing value
	System.out.println(obj);
	//10 20 30 10 

//second way using for lopp
for (int i=0;i<obj.size();i++) {
	System.out.println(obj.get(i));
}
//third way-using for each loop
for(int j:obj) {
	System.out.println(j);
}
//to clear the arraylist
obj.clear();
System.out.println(obj);


}
}
