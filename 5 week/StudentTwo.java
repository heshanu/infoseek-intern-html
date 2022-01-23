import java.util.Scanner;
public class StudentTwo{
	
	static String name;
	static char gender;
	static int dob;
	static int now = 2022;
	static int num;
	static int[] marks = {30, 80, 72};
	static Scanner sc=new Scanner(System.in);
		
	public static void main (String []args)
	{
		
		StudentTwo s1=new StudentTwo();
		s1.nameG();s1.genG();s1.yearG();s1.monthG();s1.findMax();
			//inputG();
		System.out.println();
		nameG();
		System.out.println();
		genG();
		System.out.println();
		yearG();
        System.out.println();
		monthG();
        System.out.println();
        //marksG();	findMax();	
		
	
	}
	static void nameG(){
		System.out.println("Enter your Name");
		name=sc.next();
	};
	
	static void genG(){
		System.out.println("Enter your gender");
		gender=sc.next().charAt(0);
		
		if(gender == 'M'){
			System.out.println("Male");
		}else if(gender == 'F'){
			System.out.println("Female");
		}
		else{
			System.out.println("Invalid");
		}
	};
	
	static void yearG(){
		System.out.println("Enter your Birth Year");
		dob =sc.nextInt();
		if(dob>1980 && dob<2022){
					System.out.println("old now "+(now-dob));
			}else{
							System.out.println("invalid year");
				}			
		}
	
	static void monthG(){
		System.out.println("Enter a month number");
		num=sc.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("January");
			break;
			case 2:
			System.out.println("February");
			break;
			case 3:
			System.out.println("March");
			break;
			case 4:
			System.out.println("April");
			break;
			case 5:
			System.out.println("May");
			break;
			case 6:
			System.out.println("June");
			break;
			case 7:
			System.out.println("July");
			break;
			case 8:
			System.out.println("August");
			break;
			case 9:
			System.out.println("September");
			break;
			case 10:
			System.out.println("October");
			break;
			case 11:
			System.out.println("November");
			break;
			case 12:
			System.out.println("December");
			break;
			default:
			System.out.println("Invalid");
		}
	}

	void findMax(){
		if (marks[0] >=marks[1] && marks[0] >= marks[2])
				System.out.println( marks[0] + " is the maximum number.");
		else if (marks[1] >= marks[0] && marks[1] >= marks[2])
				System.out.println( marks[1] + " is the maximum number.");
		else
			System.out.println( marks[2] + " is the maximum number.");



}
}