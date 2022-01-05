public class BinaryOp{

public static void main(String []arg){

	int a=50;int b=3;
	int c=a/b;

	//type casting
	double e=(double)a/b;
	int f=a*b;
	int l=a%b;
	System.out.println(e);

	//double to int casting
	double temp=12.56;
	int t=(int)temp;
	System.out.println(t);

	//double to string	
	double price=125.778;
	String strp=String.valueOf(price);
	
	//r
	String age="12";
	int ageInt=Integer.parseInt(age);
	System.out.println(ageInt);

	int mathMark=67;
	int scienceMark=78;
	
	if((mathMark>75)|| (scienceMark>75)){
		System.out.println("good");
	}else{
		System.out.println("bad");
	}

	//Relational Operators-they concern only values
	int age2=25;int age3=25;double age4=25.0;long age5=25L;float age6=25f;
	
	System.out.println(age2==age3);
	System.out.println(age3==age4);
	System.out.println(age4==age5);
	System.out.println(age5==age6);	

	char letter1='A';
	char letter2='B';
	System.out.println(letter1==letter2);	

	//references datatypes-checks only memory address of varaibles
	String name5="Heshan";
	String name6=" Heshan";
	String name7="Heshan ";

	System.out.println(name5==name6);
	System.out.println(name5==name7);
	System.out.println(name6==name7);

	System.out.println("=====");
	//System.out.println(name5 instanceof String);

	if(name5 instanceof String){
		name5.substring(2,5);
	}else{
		System.out.println("12");	
	}		
	int c1=10;
	System.out.println(~c1);
	
	
}
}