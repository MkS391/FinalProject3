
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

        return String.format("%-20s:%s%-20s:%s%-20s:%f%-20s:%s%-20s:%s", "Title", title, "Author", author, "Price", price, "Publisher", publisher, "Isbn", isbn);
    }

    public boolean equals(Object obj) {
        return equals(obj);
    }

    public Book clone() {
        return new Book(this);
    }
}

