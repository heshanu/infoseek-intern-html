import java.util.*;
class C{
	
	public static void main(String []ar){
	//Scanner sc=new Scanner(System.in);
	C c1=new C();
	c1.dateFinder();
		
}

	void dateFinder(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number only");
		String day=sc.next();
		

		if(day.equals("1")){
	
			System.out.println("day is Monday");
		}
		else if(day.equals("2")){
			//d="Tuesday";
			System.out.println("day is Tuesday");
		}else if(day.equals("3"))
		{
			//d="Wednessday";
			System.out.println("day is Wednessday ");
		}
		else if(day.equals("4")){
			//d="Thursday";
			System.out.println("day is Thursday");
		}
		else if(day.equals("5")){
			//d="Friday";
			System.out.println("day is Friday");
		}
		else if(day.equals("6")){
			//d="Saturday";
			System.out.println("day is Saturday");
		}
		else if(day.equals("7")){
			//d="Sunday";
			System.out.println("day is Sunday");
		}
		else{
			System.out.println("please enter valid number");
		}
			

}
}