package data_structures_lesson3.homework.section2;

import java.util.*;

public class FindTwoPairs {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 11, 15, 1, 8);
        int target = 9;
        System.out.println(findTwoPairs(numbers, target));
    }

    public static List<Integer> findTwoPairs(List<Integer> list, int target){
        Set<Integer> set = new HashSet<>();

        for(int i : list){
            int num = target-i;
            if(set.contains(num)){
                return Arrays.asList(i, num);
            }

            set.add(i);
        }

        return Collections.emptyList();
    }
}
