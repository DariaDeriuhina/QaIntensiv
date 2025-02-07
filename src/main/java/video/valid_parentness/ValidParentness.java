package video.valid_parentness;

import java.util.Stack;

public class ValidParentness {
    public static void main(String[] args) {
        String s = "()[{}";
        System.out.println(isParentness(s));
    }

    //{, [, ( -> stack. }, ), ] -> pop

    public static boolean isParentness(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                if(c == '}' && stack.pop()!= '{') return false;
                if(c == ')' && stack.pop()!= '(') return false;
                if(c == ']' && stack.pop()!= '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
