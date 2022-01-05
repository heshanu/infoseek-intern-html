public class PeopleMain{

 public static void main(String[] args) {
        People african=new African();
	african.name="Africa";african.color="black";
        System.out.println("African name "+african.name);
        System.out.println("African color "+african.color);

        System.out.println("===============================");
        People asian=new Asia();
asian.name="asians";asian.color="Fair";
        System.out.println("Asian "+asian.name);
        System.out.println("asian color "+asian.color);
        asian.sing();
       // System.out.println("African color "+african.color);

        System.out.println("===============================");
        People europe=new Europe();
	europe.name="europe";europe.color="white";
        System.out.println("Erope "+europe.name);
        System.out.println("europe color "+europe.color);
        europe.sing();
        // System.out.println("African color "+african.color);



    }
}