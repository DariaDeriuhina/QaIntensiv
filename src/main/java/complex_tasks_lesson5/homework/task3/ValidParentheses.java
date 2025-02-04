package complex_tasks_lesson5.homework.task3;

import javax.print.DocFlavor;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isParenthesesValid(s));
    }

    public static boolean isParenthesesValid(String str){
        Stack<Character> stack = new Stack<>();
        for(char c:str.toCharArray()){
            if(c== '[' || c== '{' || c== '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                if((c==']' && stack.pop()!='[') || ((c=='}' && stack.pop()!='{'))
                        || ((c==')' && stack.pop()!='('))) return false;
            }
        }
        return stack.isEmpty();
    }
}
