package Inheritance;

public class Home {
    public static void main(String a[]){
        LivingRoom livingRoom=new LivingRoom();

        livingRoom.breath=40;
        livingRoom.length=60;


        System.out.println(livingRoom.getArea()+""+livingRoom.NOOFWINDOWS);
    }
}
