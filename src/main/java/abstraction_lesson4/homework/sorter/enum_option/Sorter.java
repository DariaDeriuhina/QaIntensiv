package abstraction_lesson4.homework.sorter.enum_option;

public class Sorter {

    public void sort(int[] num, Sort sort){
        sort.getSortingAlgorithm().sort(num);
    }
}
