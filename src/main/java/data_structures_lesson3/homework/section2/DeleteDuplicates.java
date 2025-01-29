package data_structures_lesson3.homework.section2;

import java.util.*;

public class DeleteDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,2,3,3,4));
        System.out.println(uniqueElements(list));
    }

    public static <T> Set<T> uniqueElements(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
