import java.util.ArrayList;
import java.util.Objects;

/**
 *
 *
 * @author Mkrtich
 */

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public Library(Library other) {
        this.books = new ArrayList<>(other.books);
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass())return false;
        Library library = (Library) obj;
        return books.equals(library.books);
    }

    public String toString() {
        return String.format("%s",books);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
