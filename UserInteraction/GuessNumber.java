package UserInteraction;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
        public static void main(String args[]){
            //Generate a random lucky number

        int guess;
        int noOfStudents;
            int randNo=(int) (Math.random()*45)+1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the no of students");
        //No of gueses allowed
        noOfStudents=scanner.nextInt();
        System.out.println("Select between the range of 1 to 45");
        for (int i=noOfStudents;i>0;i--) {
            System.out.println("Guess the no ");
            //Iterates for every student
            System.out.println("Chances remaing "+i);
            //Input the guess every time
            guess = scanner.nextInt();
            if (randNo==guess){
                //Prints if the guessed no is right and finishes
                System.out.println("You guessed it right");
                break;
            }
            else{
                //Prints if the guess is wrong
                System.out.println("You are wrong");
            }
        }

//Show the lucky no in the end
System.out.println("The actual Random no is "+randNo);
    }
}
