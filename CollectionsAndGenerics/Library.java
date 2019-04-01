package CollectionsAndGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String args[]){
        List<String> bookList=new ArrayList<>();
        bookList.add("Harry Porter");
        bookList.add("The respect");
        bookList.add("Chicken soup");
        bookList.add("Who moved my cheese");
        bookList.add(1,"Think and grow");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the item to be removed");
        String itemToBeRemoved=scanner.nextLine();
        if (bookList.contains(itemToBeRemoved)){
            bookList.remove(itemToBeRemoved);

        }
        for (String book:bookList){

            System.out.println(book);
        }

        int listsize=bookList.size();
        System.out.println("No of books "+listsize);
        bookList.clear();
        System.out.println("No of books "+bookList.size());
    }
}
