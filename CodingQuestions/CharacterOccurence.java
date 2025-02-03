import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
    public static void main(String[] args) {
        String str = "Welcome to Programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int occurence = 0;
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getKey() == 'g'){
                occurence = m.getValue();
            }
        }
        System.out.println("The occurence of the m: " + occurence);
    }
}
