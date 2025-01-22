package basics_lesson1.classwork;

import org.testng.Assert;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abccba";
        String str2 = "abccbar";
        Assert.assertFalse(isPalindrome2(str2));
        Assert.assertTrue(isPalindrome(str));
    }

    private static boolean isPalindrome(String str){

        if(str.isEmpty() || str==null){
            return false;
        }

        int li = 0;
        int ri = str.length()-1;

        while(li<ri){
            if(str.charAt(li)!=str.charAt(ri)){
                return false;
            }

            li++;
            ri--;
        }

        return true;
    }

    private static boolean isPalindrome2(String str){
        if(str==null || str.isEmpty()){
            return false;
        }

        String stringBuilder = new StringBuilder(str).reverse().toString();
        return str.equals(stringBuilder);
    }
}

