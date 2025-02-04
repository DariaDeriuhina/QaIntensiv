package complex_tasks_lesson5.homework.task5;

import java.util.List;

public class Library {
    private List<Book> books;
    private Book activeBook;

    public Library(List<Book> books) {
        this.books = books;
        this.activeBook = books.get(0);
    }

    public void switchToAnotherBook(Book book){
        if(books.contains(book)) {
            activeBook = book;
        } else {
            throw new IllegalArgumentException("Library doesn't have such book");
        }
    }

    public Book openActiveBook(){
        return activeBook;
    }

    @Override
    public String toString() {
        return "Library{" +
                "activeBook=" + activeBook +
                '}';
    }
}
