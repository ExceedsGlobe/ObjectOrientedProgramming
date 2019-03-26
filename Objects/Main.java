package Objects;

public class Main {
//Level 1 of using objects
    public static void main(String[] args) {
        Pokemon obj=new Pokemon();
        //Setting the value for fields
        obj.name="Charizod";
        obj.type="Fire";
        obj.health=100;
//Acessing the values by fields
        System.out.println(obj.name);
        //Calling method prints out
        obj.attack();
    }
}
