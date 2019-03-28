package UserInteraction;

import java.util.Scanner;

public class Profile {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String name;
        String email;
        int age;
        //Accepts the name as input
        System.out.println("Input the name");
        name=scanner.nextLine();
        //Accepts the email as input
        System.out.println("Input the email");
        email=scanner.nextLine();
        //Accepts the age as input
        System.out.println("Input the Age");
        age=scanner.nextInt();

//Displaying the variable values
        System.out.println("The name is "+name);
        System.out.println("The email is "+email);
        System.out.println("The age is "+age);

    }
}
