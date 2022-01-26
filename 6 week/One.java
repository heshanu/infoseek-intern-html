import java.util.*;

public class One{

public static void main(String [] ar){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter subject here");
	String subject=sc.next();

	if(subject==null || subject==" " || subject.equalsIgnoreCase("math") ==false  || subject.equalsIgnoreCase("science") ==false){
		System.out.println("Enter valid subject");
	}else{
		System.out.println("Enter marks here");
		int marks=sc.nextInt();
		String grade=" ";
		System.out.println("marks "+marks);

		if(subject.equalsIgnoreCase("science")){
			if(marks>=75 && marks<=100){
				grade="A";}
			else if(marks>=50 && marks<75){
				grade="B";}
			else if(marks>=30 && marks<50){
				grade="C";}
			else if(marks>=0 && marks<30){
				grade="F";}
			else{
				System.out.println("INvalid number");
			}
		}else if(subject.equalsIgnoreCase("math")){
			if(marks>=0 && marks<=50){
				grade="Fail";
			}
			else if(marks>50 && marks<=100){
				grade="Pass";
			}
			else{
				System.out.println("INvalid number");
			}
		}else{
			System.out.println("Invalid Subject!");
		}
			System.out.println("Subject= "+ subject+ " Marks ="+marks+" grade is "+grade);
	}

	}
}