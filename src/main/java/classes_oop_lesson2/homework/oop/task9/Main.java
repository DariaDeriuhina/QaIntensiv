package classes_oop_lesson2.homework.oop.task9;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Secret", "Unknown", 1990);
        Book book2 = new Book("Secret 2", "Unknown", 1993);
        Library library = new Library();
        library.addBook(book);
        library.addBook(book2);
        System.out.println(library.findBookByName("Secret"));
        System.out.println();
        book2.borrowBook();
        library.printAllLibrary();
    }
}
