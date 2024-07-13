
**Problem Statement:** Implementing a simple application to manage a library system, allowing users to add books, search for books by title, and display all books in the library.

**Solution Overview:**
- **Classes:** The solution includes several classes to represent different entities in the library system:
  - `Book`: Represents a book with attributes like title, author, and ISBN.
  - `Library`: Manages a collection of books and provides methods for adding books, searching by title, and displaying all books.
  - `Main`: Contains the main method to run the application and interact with the user.

- **Functionality:**
  - **Adding Books:** Users can add new books to the library by providing details such as title, author, and ISBN. This is achieved through a method in the `Library` class that adds a new `Book` object to a list of books.
  
  - **Searching Books:** Users can search for books by title. The `Library` class includes a method that iterates through the list of books and returns books whose titles match the search query.
  
  - **Displaying Books:** The `Library` class also provides a method to display all books currently in the library. This method prints out details of each book stored in the list.

- **Implementation:**
 
  // Book.java
  public class Book {
      private String title;
      private String author;
      private String isbn;
      
   public Book(String title, String author, String isbn) {
        this.title = title;
          this.author = author;
          this.isbn = isbn;
      }
      
      // Getters and setters
  
      @Override
    public String toString() {
          return "Book{" +
                 "title='" + title + '\'' +
                 ", author='" + author + '\'' +
                 ", isbn='" + isbn + '\'' +
                 '}';
      }
  }

  // Library.java
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

Explanation:
- **Book Class:** Represents a book with attributes (`title`, `author`, `isbn`) and provides a constructor and methods for retrieving these attributes.
- **Library Class:** Manages a list of `Book` objects (`books`) and provides methods (`addBook`, `searchByTitle`, `displayAllBooks`) to manipulate and interact with this list.
- **Main Class:** Implements the main method to run the library application. It uses a `Scanner` object to read user input and offers a menu-driven interface (`1. Add a book`, `2. Search books by title`, `3. Display all books`, `4. Exit`) to perform operations on the library system.

This Java solution demonstrates basic object-oriented programming principles and provides functionality to manage a library system effectively through console interactions.
