package data_structures_lesson3.homework.section2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String text = "aabccdeff";
        System.out.println(findFirstUniqueWords(text));
    }

    public static Character findFirstUniqueWords(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }

        return null;
    }
}
