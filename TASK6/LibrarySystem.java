import java.util.HashSet;

public class LibrarySystem {

    // Book class
    public static class Book {
        private String title;
        private String author;
        private String isbn;
        private boolean isAvailable;

        public Book(String title, String author, String isbn, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isAvailable = isAvailable;
        }

        // Getters and setters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getIsbn() {
            return isbn;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Book book = (Book) obj;
            return isbn.equals(book.isbn);
        }

        @Override
        public int hashCode() {
            return isbn.hashCode();
        }
    }

    // Library class
    public static class Library {
        private HashSet<Book> books;

        public Library() {
            this.books = new HashSet<>();
        }

        // Add a book to the library
        public void addBook(Book book) {
            books.add(book);
        }

        // Remove a book from the library
        public void removeBook(Book book) {
            books.remove(book);
        }

        // Check if a book is available
        public boolean isBookAvailable(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title) && book.isAvailable()) {
                    return true;
                }
            }
            return false;
        }

        // Display all available books
        public void displayAvailableBooks() {
            for (Book book : books) {
                if (book.isAvailable()) {
                    System.out.println("Title: " + book.getTitle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("ISBN: " + book.getIsbn());
                    System.out.println();
                }
            }
        }
    }

    // Main class
    public static void main(String[] args) {
        Library library = new Library();

        // Add 5 new books
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "9780747532743", true));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780261102385", true));
        library.addBook(new Book("Alien", "Alan Dean Foster", "9780446938234", true));
        library.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "9781400052929", true));
        library.addBook(new Book("1984", "George Orwell", "9780451524935", true));

        // Remove 3rd book
        library.removeBook(new Book("Alien", "Alan Dean Foster", "9780446938234", true));

        // Check if book "Alien" is available
        System.out.println("Is 'Alien' available? " + library.isBookAvailable("Alien"));

        // Display all available books
        System.out.println("Available Books:");
        library.displayAvailableBooks();
    }
}