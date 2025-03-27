import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    //searching by title
    public void searchBook(String title) {
        //enhanced for loop
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBook();
                return;
            }
        }
        System.out.println("No book found with the title: " + title);
    }

    //searching by author
    public void searchBookByAuthor(String author) {
        boolean found = false;
        //enhanced for loop
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                if (!found) {
                    System.out.println("Books by " + author + ":");
                    found = true;
                }
                book.displayBook();
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }

    //searching by ISBN
    public void searchBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Book found:");
                book.displayBook();
                return;
            }
        }
        System.out.println("No book found with ISBN: " + isbn);
    }
    //displaying books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}
