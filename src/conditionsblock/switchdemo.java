package conditionsblock;

public class switchdemo {

	/*
	Switch(expression){
		case value 1:
			//code to be executed;
			break; //optional
		case value 2:
			//code to be executed;
			break; //optional
		.
		.
		.
		.	
		default; //optional
		//code to be executed if all cases are not matched;
		
	}
	*/
	
	
	public static void main(String[]args){
		
		int day=2;
		switch(day) {
		case 1:
			System.out.println("monday");
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thurday");
			break;
		case 5:
			System.out.println("friday");
			
	    default:
			System.out.println("sunday");
			
            //char=a,b,c,d.e
			//string=double quotes
		
			
	}
	}
}
