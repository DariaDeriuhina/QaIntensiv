package abstraction_lesson4.homework.sorter.interface_option;

public class Sorter {
    private Sortable sortable;

    public Sorter(Sortable sortable){
        this.sortable = sortable;
    }

    public void sort(int[] num) {
        sortable.sort(num);
    }
}
