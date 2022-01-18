import java.util.*;
class Grade{
	
	public static void main(String []ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		//System.out.println(marks);
		if(marks>=90 && marks<100){
		
			System.out.println("A+");
		}
		else if(marks>=80 && marks<90){
	
			System.out.println("A");
		}else if(marks>=70 && marks<80)
		{
			System.out.println("B");
		}
		else if(marks>=60 && marks<70 ){
		
			System.out.println("C");
		}
		else if(marks>=50 && marks<60){
			System.out.println("D");
		}
		else{
			System.out.println("Faild");
		}
		
}

}