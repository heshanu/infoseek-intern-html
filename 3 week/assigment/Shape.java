public class Shape{
public static final double PI =3.14;
String name;
int corner;
double area;
double c;

public static void main(String []a){

Circle c1=new Circle(1.1);
System.out.println("name of shape"+c1.name);
System.out.println("color of circle "+c1.cornor);
System.out.println("area of circle "+c1.area());
System.out.println("c of circle "+c1.c());
System.out.println("=========================");

Square sq=new Square(1.5);
System.out.println("name of shape "+sq.name);
System.out.println("number of cornor "+sq.cornor);
System.out.println("Area of square "+sq.area());
System.out.println("C of square "+sq.c());
System.out.println("=========================");

Triangle tr=new Triangle(1.5,3);
System.out.println("Name of Shape "+tr.name);
System.out.println("number of corners "+tr.cornor);
System.out.println("area of triangle "+tr.area());
System.out.println("c of triangle "+tr.c());
System.out.println("=========================");

Rectangle re=new Rectangle(1.5,3);
System.out.println("Name of shape "+re.name);
System.out.println("number of corners "+re.cornor);
System.out.println("area of rectangle "+re.area());
System.out.println("c of rectangle "+re.c());
System.out.println("=========================");





}
double area(){	
	return 0.0;
}

double c(){
	return 0.0;
}
}


class Circle extends Shape{

	String name="circle";
	int cornor=0;
	private double r;
	
	public Circle(double r){
		this.r=r;	
	}
	
	public double area(){
	return Shape.PI*r*r; 
	}

	public double c(){
	return Shape.PI*2*r;
}
}

class Square extends Shape{

	String name="squre";
	int cornor=4;
	double l;
	public Square(double l){	
		this.l=l;
	}
	public double area(){
	return l*l;
	}

	public double c(){
	return 4l;
}
}


class Triangle extends Shape{
	
	String name="triangle";
	int cornor=3;
	double ll;double ww;

	public Triangle(double ll,double ww){
		this.ll=ll;
		this.ww=ww;
	}

	public double area(){
		return (ll*ww)/2;
	}

	public double c(){
		return 3*ll;
	}
}


class Rectangle extends Shape{

	String name="Rectangle";
	int cornor=4;
	double l;double w;
	//constructor
	public Rectangle(double l,double w){
		this.l=l;
		this.w=w;
	}

	public double area(){
		return (l*w);
	}

	public double c(){
		return (w+l)*2;
	}
	
}