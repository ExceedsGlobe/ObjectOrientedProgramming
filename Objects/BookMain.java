package Objects;

public class BookMain {
    public static void main(String[] args) {
        //Level 2 having setter & getter methods
        Book book=new Book();
        //Setters
        book.setTitle("Think and grow");
        book.setAuthor("Robert");
        book.setPrice(250.00);
        //Getters
        String title=book.getTitle();
        String authorName=book.getAuthor();
        double price=book.getPrice();
        //Prints
        System.out.println(title);
        System.out.println(authorName);
        System.out.println(price);


    }
}
