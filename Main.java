public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        //book objects
        Book book1 = new Book("BOOK-1", "AUTHOR-1", "123");
        Book book2 = new Book("BOOK-2", "AUTHOR-2", "124");
        Book book3 = new Book("BOOK-3", "AUTHOR-3", "125");

        // Adding books to library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        // Display all books
        myLibrary.displayAllBooks();

        // Searching books using method overloading
        System.out.println("\n Searching books...");
        myLibrary.searchBook("BOOK-3");              // Search by title
        myLibrary.searchBookByAuthor("AUTHOR-2"); // Search by author
        myLibrary.searchBookByISBN("123");   // Search by ISBN
        myLibrary.searchBook("Unknown Book");      // Searching for a non-existent book
    }
}
