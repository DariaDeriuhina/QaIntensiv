package classes_oop_lesson2.homework.oop.task9;

public class Book {
    private String name;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public String getName() {
        return name;
    }

    public Book(String name, String author, int yearPublished) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            this.isAvailable = false;
            System.out.println("You borrowed the book " + name);
        } else {
            System.out.println("The book is not available to borrow " + name);
        }
    }

    public void returnBook(){
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have successfully returned: " + name);
        } else {
            System.out.println("The book was not borrowed: " + name);
        }
    }

    public String getBookInfo(){
        return "Name: " + name +
                ", Author: " + author +
                ", Year of Publishing: " + yearPublished +
                ", Available: " + isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
