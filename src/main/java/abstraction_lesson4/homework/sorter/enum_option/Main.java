package abstraction_lesson4.homework.sorter.enum_option;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sort(new int[5], Sort.BUBBLE);
        sorter.sort(new int[5], Sort.QUICK);
        sorter.sort(new int[5], Sort.MERGE);
    }
}
