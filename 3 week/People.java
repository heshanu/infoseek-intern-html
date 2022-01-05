public class People{

 public String name;
 public String color;
    public void sing(){
        System.out.println("singing ..");
    }


}

class African extends People{
 
    public void sing(){
        System.out.println("Africa has Tribe music");
    }

}
class Europe extends People{
  
    public void sing(){
        System.out.println("Europe listein EDM music");
    }
    public void eat(){
        System.out.println("Europe has BBQ");
    }

}

class Asia extends People{

    public void sing(){
        System.out.println("Asians has cultural music");
    }
    public void eat(){
        System.out.println("Asias are Vegetarains");
    }

    public void drink(){
        System.out.println("Drink sake");
    }


}

