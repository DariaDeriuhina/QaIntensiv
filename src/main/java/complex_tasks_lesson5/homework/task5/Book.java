package complex_tasks_lesson5.homework.task5;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<Page> pages;
    private Page activePage;
    private String name;
    private String author;
    private int numberOfPages;

    public Book(String name, String author, int numberOfPages){
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        pages = new ArrayList<>();
        for(int i = 0; i<numberOfPages; i++){
            pages.add(new Page("New page with number: " + (i+1), i+1));
        }
        activePage = pages.get(0);
    }

    public Page turnForwardPage() {
        int index = pages.indexOf(activePage);
        if (index == numberOfPages - 1) {
            throw new IllegalArgumentException("Invalid page number");
        } else {
            this.activePage = pages.get(index + 1);
            return activePage;
        }
    }

    public Page turnBackPage(){
        int index = pages.indexOf(activePage);
        if(index == 0) {
            throw new IllegalArgumentException("Invalid page number");
        } else {
            this.activePage = pages.get(index - 1);
            return activePage;
        }
    }

    @Override
    public String toString() {
        return "Book " + name + " by " + author + "\n" +
                activePage;
    }

    public Page getActivePage() {
        return activePage;
    }
}
