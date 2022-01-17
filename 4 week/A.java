import java.util.Scanner;

class A{

public static void main(String []ar){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter operator");
	String i=sc.next();

	System.out.println("enter operand1");
	int op1=sc.nextInt();

	System.out.println("enter operand2");
	int op2=sc.nextInt();

	//int answer=i.equals("+")op1+op2?i.equals("-"):op1+op2:?i.equals("/"):?op1/op2?i.equals("*"):op1*op2:0;

	int as=i.equals("+")?op1+op2:i.equals("-")?op1-op2:i.equals("/")?op1/op2:i.equals("*")?op1*op2:op1%op2;
	System.out.print("Answer is:"+as);

}



}