package UserInteraction;

import java.util.Scanner;
import java.io.*;
public class WordCount {
    public static void main(String args[]){
        //Save the path in the file
        File book=new File("E:/ObjectOrientedProgramming/src/UserInteraction/book.txt");
        try {
            int countLine=0;
            int wordCount=0;
            //Scans the file
            Scanner sc = new Scanner(book);
            //Loops until the book has nextLine
            while(sc.hasNextLine()){
                countLine++;
                //This is a single lin
               String line=sc.nextLine();
                //Words are splitted by " ", we store in string array
               String words[]=line.split(" ");
               for(String word:words){
                   //Incrementing word count
                   wordCount++;
               }
            }
//printing the wordcount
            System.out.println("No of words "+wordCount);
            System.out.println("No of Lines "+countLine);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }

        }
}
