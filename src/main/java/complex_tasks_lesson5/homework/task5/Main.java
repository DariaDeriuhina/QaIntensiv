package complex_tasks_lesson5.homework.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Joan Rouling", 200);
        Book book2 = new Book("Hunger Games", "Joan Rouling", 200);
        Book book3 = new Book("Game of Thrones", "Jorge Martin", 200);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library(books);
        Book activeBook = library.openActiveBook();
        System.out.println(activeBook);
        activeBook.turnForwardPage();
        System.out.println(activeBook);


    }
}
