import java.util.*;
public class FindfirstnonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "Aman Kumar Giri Goswami";
        input = input.toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                System.out.println("First non repeating character is: " + m.getKey());
                break;
            }
        }
    }
}
