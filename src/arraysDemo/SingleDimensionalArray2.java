package arraysDemo;

import java.util.Arrays;

public class SingleDimensionalArray2 {
	
	public static void main(String args[]) {
	
int []a= {10,20,30,40,50,60,70};

System.out.println(a.length);

System.out.println(a[4]);


// First Way to print-
System.out.println(Arrays.toString(a));

a[2]=45;

System.out.println(Arrays.toString(a));




// Second way to print the array- using for loop-
for (int i=0 ;i <a.length;i++) {
	System.out.print(a[i]+" ");
}


// Third Way --using for each loop-
/*   * for(datatype newVariableName: oldVariableName){
 *    * sysout(newVariableName); }
 *    * 
 */  
//int[] a = { 10, 20, 30, 40, 50, 60, 70 }; 
for(int k:a)
if(k<40) {	System.out.print(k);

}
   String[]s= {"rahul","ramesh","ram"};

    System.out.println(Arrays.toString(s));




	}
}
