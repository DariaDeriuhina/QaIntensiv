package data_structures_lesson3.homework;

public class Task2 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){

        if(str == null || str.isEmpty()){
            return str;
        }
        char[] chars = str.toCharArray();
        int li = 0;
        int ri = chars.length-1;

        while(li<ri){
            char temp = chars[li];
            chars[li] = chars[ri];
            chars[ri] = temp;

            li++;
            ri--;
        }

        return new String(chars);
    }
}
