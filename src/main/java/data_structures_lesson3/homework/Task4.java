package data_structures_lesson3.homework;

import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(isBracketCorrect("([]{})")); // true
        System.out.println(isBracketCorrect("([)]"));   // false
        System.out.println(isBracketCorrect("{[()]}")); // true
        System.out.println(isBracketCorrect("((())")); // false
    }

    public static boolean isBracketCorrect(String str){
        Stack<Character> stack = new Stack<>();

        for (char c: str.toCharArray()){

            if(c == '(' || c=='{' || c=='[') {
                stack.push(c);
            } else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((c==')' && top!= '(') || (c=='}' && top!= '{') || (c==']' && top!= '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
