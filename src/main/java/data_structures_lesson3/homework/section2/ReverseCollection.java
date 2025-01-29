package data_structures_lesson3.homework.section2;

import java.util.*;

public class ReverseCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(reverseCollection(list));
        System.out.println(reverseCollection2(list));
    }

    public static <T> Collection<T> reverseCollection(Collection<T> collection){
        Stack<T> stack = new Stack<>();
        Stack<T> stack2 = new Stack<>();
        for(T element:collection){
            stack.push(element);
        }

        while(!stack.isEmpty()){
            stack2.push(stack.pop());
        }

        return stack2;

    }

    public static <T> List<T> reverseCollection2(Collection<T> collection){
        List<T> list = new ArrayList<>(collection);
        Collections.reverse(list);
        return list;
    }
}
