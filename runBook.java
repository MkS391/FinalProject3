import java.util.ArrayList;

/**
 *
 *
 * @author Mkrtich
 */
public class runBook {

    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye","J.D.Salinger",7.99,"Little,Brown and Company","9780316769488");
        Book book2 = new Book("1984","George Orwell",400.99,"Secker and Warburg","9780451524931");
        Book book3 = new Book("Jane Eyre","Charlotte Bronte",7.99,"Smith Elder and Co.","9780141447146");
        Book book4 = new Book("The Not So Great Gatsby","F.Scott Fitzgerald",10.99,"Charles Scribner's Sons","9780743273565");
        Book book5 = new Book("Brave New World", "Aldous Huxley",4.20,"Harper Perennial Modern Classics","9780060850524");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        Library library = new Library(bookList);

        ArrayList<Book> searchResults = library.searchBook("Brave");
        for(Book book : searchResults){
            System.out.println(book);
        }
}
}
