package Collections;

import java.util.HashMap;

public class OccurenceOfCharacterUsingHashMap {
public static void main (String args[]) {
	String a="dghha dg ";
	String b=a.replaceAll(" ", "k");
	char ch[]=b.toCharArray();
	//converting to character array
	//ch[]={'d','g','d','h','h','a'}
	HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
	for(int i=0;i<ch.length;i++) {
		//applied for loop over the character
		if(hm.containsKey(ch[i])) {
			hm.put(ch[i],hm.get(ch[i])+1);
		}else {
			hm.put(ch[i],1);  //hm.put(d.1) //hm.put(g.1)
		}
	}
	System.out.println(hm);
}
}
