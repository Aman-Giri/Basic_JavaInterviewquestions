import java.util.LinkedHashMap;
import java.util.Map;

public class Findfirst3nonrepeatingChar {
    public static void main(String[] args) {
        String input = "Aman Kumar Giri Goswami";
        input = input.toLowerCase();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : input.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                count++;
                System.out.println(count + " non repeating character is: " + m.getKey());
                if(count == 3){
                    break;
                }
            }
        }
    }
}
