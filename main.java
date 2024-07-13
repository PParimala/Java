// Main.java
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("1. Add a book");
            System.out.println("2. Search books by title");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter title to search: ");
                    String searchTitle = scanner.nextLine();
                    List<Book> searchResult = library.searchByTitle(searchTitle);
                    if (searchResult.isEmpty()) {
                        System.out.println("No books found with title '" + searchTitle + "'");
                    } else {
                        System.out.println("Books found:");
                        for (Book book : searchResult) {
                            System.out.println(book);
                        }
                    }
                    break;
                case 3:
                    System.out.println("All books in the library:");
                    library.displayAllBooks();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the library system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
        
        scanner.close();
    }
}
