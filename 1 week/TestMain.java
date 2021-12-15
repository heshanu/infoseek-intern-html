import java.util.*;

public class TestMain{

public static void main(String args[]){

//String a="MY NAME IS";
//String b="John";
//String c="AVERAGE MARK IS";
//float d=(75+45+80+50)/3f;

Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String n=sc.next();

System.out.println("Enter number one");

int num1=sc.nextInt();
System.out.println("Enter number two");
int num2=sc.nextInt();


System.out.println("1--- Add");
System.out.println("2--- Sub");
System.out.println("3--- Multi");
System.out.println("4--- Div");

int op=sc.nextInt();
double ans=0;

switch(op){
case 1:
	ans=num1+num2;break;
case 2:
	if(num1>num2){  ans=num1-num2;
	}
else{
	ans=num2-num1;
	
}break;
case 3:
	ans=num1*num2;break;
	
case 4:

	if(num1<=0 || num2<=0){ 
}else{
	ans=num1/num2;
}
 	break;
}

System.out.println(n +" Your answer is "+" "+ans);
}
}







