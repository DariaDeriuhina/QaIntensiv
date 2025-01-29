package data_structures_lesson3.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));;
        deleteEvenNums(list);
        System.out.println(list);
    }

    public static void deleteEvenNums(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            if(num%2==0){
                iterator.remove();
            }
        }
    }
}
