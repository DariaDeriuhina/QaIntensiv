package data_structures_lesson3.homework;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        Map<Character, Integer> result = countCharacters(str);

        for(Map.Entry<Character, Integer> entry: result.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }

    }

    public static Map<Character, Integer> countCharacters(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        return map;
    }
}
