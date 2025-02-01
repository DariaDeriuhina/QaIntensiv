package abstraction_lesson4.homework.sorter.interface_option;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter(new MergeSort());
        sorter.sort(new int[]{1,2,3});
    }
}
