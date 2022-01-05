import java.util.Scanner;
public class Circle{

public static final double pi=3.14;
//static double r=14;

public static void main(String []a){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter r");
	double r=sc.nextDouble();
	

	//Circle c=new Circle();

	
	 double calculateC(){
		return 2*pi*r;
	}

	double calculateA(){
		return pi*r*r;
	}	 
	
	System.out.println("c is "+calculateC());
	System.out.println("area is "+calculateA());


	}

}


