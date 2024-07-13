import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
