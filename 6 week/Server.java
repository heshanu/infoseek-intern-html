import java.util.*;
public class Server{

public static void main(String [] ar){
	
	
/*
	char c='A';
	String output="";	
	switch(c){
		
		case 'A':
			output="very good";
			break;
		
		case 'B':
			output="good";break;
		case 'C':
			output="average";break;
		case 'F':
			output="fail";break;
		default:
			value="Not found";
	}	
	System.out.println(c +" "+output);
*/
	
	//int code=200;
	while(true){
		Scanner sc=new Scanner(System.in);
	System.out.println("enter code");
	int code=sc.nextInt();	String value="";
	 switch( code){
		case 200:
			value="Success";break;
		case 404:
			value="not found";break;
			
		case 500:
			value="internal server error";break;
		case 406:
			value="Auth error";break;
		case 403:
			value="forigben";break;
		default:
			value=" it is not a predefine code!";			
		
	}
	System.out.println(code +" "+value);
	}
	}
}