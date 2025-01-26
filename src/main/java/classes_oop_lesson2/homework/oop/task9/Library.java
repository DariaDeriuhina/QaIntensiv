package classes_oop_lesson2.homework.oop.task9;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book findBookByName(String name){
        for(Book book:books){
            if(book.getName().equals(name)){
                return book;
            } else {
                System.out.println("Library doesn't have such book");
            }
        }
        return null;
    }

    public void printAllLibrary(){
        for(Book book:books){
            System.out.println(book.getBookInfo());
        }
    }
}
