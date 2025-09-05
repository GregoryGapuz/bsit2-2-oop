import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    private List<String> books;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    public void displayBooks() {
        System.out.println("--- Current Books ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, books.get(i));
        }
        System.out.println("Display operation completed.\n");
    }

    public void addBook(String title) {
        try {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }
            if (title.trim().length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }
            books.add(title.trim());
            System.out.printf("Book '%s' added successfully!%n", title.trim());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.\n");
        }
    }

    public void removeBook(String input) {
        try {
            int bookNumber = Integer.parseInt(input);
            if (bookNumber < 1 || bookNumber > books.size()) {
                throw new IndexOutOfBoundsException(
                    "Invalid book number! Please enter between 1 and " + books.size() + ".");
            }
            String removedBook = books.remove(bookNumber - 1);
            System.out.printf("Book '%s' removed successfully!%n", removedBook);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.\n");
        }
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Scanner scanner = new Scanner(System.in);

        manager.displayBooks();

        System.out.println("Enter book title to add:");
        String input = scanner.nextLine();
        manager.addBook(input);

        System.out.println("Enter book title to add:");
        input = scanner.nextLine();
        manager.addBook(input);

        System.out.println("Enter book title to add:");
        input = scanner.nextLine();
        manager.addBook(input);

        System.out.println("Enter book number to remove (1-" + manager.books.size() + "):");
        input = scanner.nextLine();
        manager.removeBook(input);

        System.out.println("Enter book number to remove (1-" + manager.books.size() + "):");
        input = scanner.nextLine();
        manager.removeBook(input);

        System.out.println("Enter book number to remove (1-" + manager.books.size() + "):");
        input = scanner.nextLine();
        manager.removeBook(input);

        System.out.println("Program completed successFully.");
        scanner.close();
    }
}

