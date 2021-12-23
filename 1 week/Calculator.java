public class Calculator {
/*
    private int num1,num2;

    public static void main(String[] args) {
        Calculator cal=new Calculator(4,10);
        System.out.println("Add number  "+cal.addNumber());
        System.out.println("Substraction number  "+cal.sub());
        System.out.println("Multiply number  "+cal.mul());
        System.out.println("Divison "+cal.divi());

    }
    //acces private variables via methods
    void getNum1(int num1){
        this.num1=num1;
    }
    int setNum1() {
        return num1;
    }
    void getNum2(int num2){
        this.num1=num2;
    }

    int setNum2(){
        return num2;
    }

    //constructor
    Calculator(int num1,int num2){
        this.num1=num1;this.num2=num2;
    }
// adding method
    int addNumber(){
        return num1+num2;
    }
//substract method
    int sub(){
        return num1-num2;
    }
    // divison method
    int divi(){
        return  num1/num2;
    }
// multification method
    int mul(){
        return num1*num2;
    }

*/


    Calculator(int a,int b,int c){
        int d=a+b+c;
    }

    Calculator(){}
    Calculator(String a){
        String d=a;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator("jo");
        Calculator c1=new Calculator(1,2,3);
        System.out.println(c1);
    }
}
