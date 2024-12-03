
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

    private String toTitleCase(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        String[] words = input.split(" ");
        StringBuilder titlecase = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                titlecase.append(word.substring(0, 1).toUpperCase());
            }
        }
        return titlecase.toString().trim();
    }
    public String toString(){
        return "";
    }

}

