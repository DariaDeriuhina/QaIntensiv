package complex_tasks_lesson5.homework.task5;

public class Page {
    private final String content;
    private int number;

    public Page(String content, int number) {
        this.content = content;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return content;
    }
}
