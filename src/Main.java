public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Greatest", "Lebby", 100);
        Book book2 = new Book("Goat", "Micmic", 464);
        Book book3 = new Book("wizard", "Thomas", 352);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book2.borrowBook();

        book1.displayInfo();
        book2.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}
