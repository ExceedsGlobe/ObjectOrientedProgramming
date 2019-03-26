package Objects;

public class Book
{

String title;
String author;
double price;
//Setter methods
    public void setPrice(double bookPrice) {
        this.price=bookPrice;

    }

    public void setAuthor(String authorName) {
    this.author=authorName;
    }

    public void setTitle(String bookTitle) {
        this.title=bookTitle;
    }
//Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
    return price;
    }
}
