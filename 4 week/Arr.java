public class Arr{

public static void main(String []r){
	int []a={1,2,3,4,5};
String []b={"a","b","c","d","e"};
double []d={1.1,1.2,3.5};

float []e={2.4f, 4.6f ,7.2f };
char c[]={'A','B','C','D','E'};

boolean []z={true,false,false};

//print integer array
for(int q:a){
	System.out.print(q+" ");
}
System.out.println("---------Integer array");	
//print string array
for(String t:b){
	System.out.print(t+" ");	
}

System.out.println("-----String array ");	

//double array
for(double y:d){
	System.out.print(y+" ");	
}

System.out.println("---------double  array ");	

//float array
for(float u:e){
	System.out.print((float)u+" ");	
}

System.out.println("------------float  array ");	


//char array
for(char i:c){
	System.out.print(i+" ");	
}

System.out.println("------------char  array ");	

//booelan array
for(boolean p:z){
	System.out.print(p+" ");	
}

System.out.println("---------boolean  array ");	

}
}
