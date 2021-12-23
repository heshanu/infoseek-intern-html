class Teacher{
int age=0;String name=" "; String subject=" ";
 public static void teach(String name,int age,String subject){
		//this.name=name;this.age=age;this.subject=subject;

	System.out.println(name+" "+"is teaching"+" "+subject+" "+age+" "+"years old");
}

public static void main(String []args){
	Teacher t1=new Teacher();
	Teacher t2=new Teacher();

	t1.teach("H",21,"sub");
	t2.teach("Heshan Umayanga",24,"Research" );
	t3.teach("jjdsdsd",23,"aasa");

	



}		
}