import java.lang.reflect.Proxy;

/**
 *
 *
 * @author Mkrtich
 */

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    //Default Constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    //Constructor with title
    public Book(String title) {
        this.title = toTitleCase(title);
        this.author = "";
        this.price = 0.0;
        this.publisher = "";
        this.isbn = "";
    }

    //Constructor with all data members
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = toTitleCase(title);
        this.author = toTitleCase(author);
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    //Copy constructor
    public Book(Book otherBook) {
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.price = otherBook.price;
        this.publisher = otherBook.publisher;
        this.isbn = otherBook.isbn;
    }

    public int checkISBNStatus() {
        if (this.isbn.length() == 13) {
            return 0;//ISBN10
        } else if (this.isbn.length() == 17) {
            return 1;//ISBN13
        } else {
            return -1;
        }

    }

    public String toTitleCase(String input) {
        String[] words = input.split(" ");

        String titleCased = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                titleCased += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() + (" ");
            }
        }
        return titleCased.trim();
    }

    public String toString() {

        return String.format("%-14s:%s%-15s:%s%-15s:%.2f$%-15s:%s%-15s:%s", "Title", title, "\nAuthor", author, "\nPrice", price, "\nPublisher", publisher, "\nIsbn", isbn);
    }

    public boolean equals(Book obj) {
        if (this == obj ){
            return true;}
        if(obj == null || getClass()!= obj.getClass()){
            return false;
        }
        Book book = (Book) obj;

        return Double.compare(book.price, price)==0 &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publisher.equals(book.publisher) &&
                isbn.equals(book.isbn);
    }

    public Book clone() {
        return new Book(this);
    }
    public String getTitle(){
        return title;
    }
    public String setTitle(String title){
        return this.title = title;
    }
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

