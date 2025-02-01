package abstraction_lesson4.homework.sorter.enum_option;

public enum Sort {
    BUBBLE(new BubbleSort()),
    MERGE(new MergeSort()),
    QUICK(new QuickSort());

    private SortingAlgorithm sortingAlgorithm;

    Sort(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public SortingAlgorithm getSortingAlgorithm() {
        return sortingAlgorithm;
    }
}
