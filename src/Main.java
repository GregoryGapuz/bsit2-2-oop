
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");

        Book b1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book b2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book b3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        Library library = new Library();

        System.out.println("Adding books to library...");
        System.out.println("Book added: " + b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Book added: " + b2.getTitle() + " by " + b2.getAuthor());
        System.out.println("Book added: " + b3.getTitle() + " by " + b3.getAuthor());
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("\nAll books in library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nTrying to borrow Java Programming again...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();
        
        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book return failed.");
        }

        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("", "Unknown", "123", 1400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Book invalidBook2 = new Book("Invalid Book", "Unknown", "123456789", 2026);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
