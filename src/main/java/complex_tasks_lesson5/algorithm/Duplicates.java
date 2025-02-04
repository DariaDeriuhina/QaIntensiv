package complex_tasks_lesson5.algorithm;

public class Duplicates {
    public static void main(String[] args) {
        String str = "helloo";
        System.out.println(removeDuplicates(str));
        System.out.println(removeDuplicates(null));
        System.out.println(removeDuplicates(""));
        System.out.println(removeDuplicates("hhhelooo"));
        System.out.println(removeDuplicates("oooooo"));
    }

    public static String removeDuplicates(String str){
        if(str==null || str.isEmpty()){
            return "";
        }
        char currentChar = str.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i<str.length();i++){
            if(currentChar != str.charAt(i)){
                stringBuilder.append(currentChar);
                currentChar = str.charAt(i);
            }
        }
        stringBuilder.append(currentChar);
        return stringBuilder.toString();
    }
}
