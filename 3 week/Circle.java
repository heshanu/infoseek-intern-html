import java.util.Scanner;
public class Circle{

public static final double pi=3.14;
//static double r=14;
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
public static void main(String []a){

	System.out.println("enter r");

	Circle c=new Circle();

	System.out.println("c is "+c.calculateC());
	System.out.println("area is "+c.calculateA());

	}

public  double calculateC(){
	return 2*pi*r;
}

public  double calculateA(){
	return pi*r*r;
} 
 
}


