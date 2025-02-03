import java.util.*;
// Occurrences related question:
// -Occurrences of all the consonants 
// -Occurences of all the vowels with those vowels also which has zero count in the String
// -Maximum and minimum Occurence of the character in the consonant
// -Note: Also handle the occurrences of the spaces in string for eg in Aman Giri there is one space so the space count should be 1
public class OccurencesProblem {
    public static void main(String[] args) {
        String input = "Aman Kumar Giri Goswami";
        HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();
        HashMap<Character,Integer> specialCharacters = new HashMap<>();

        //putting every vowel with the zero count
        for(char ch : "aeiou".toCharArray()){
            vowels.put(ch, 0);
        }

        for(char ch : input.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                char lowerchar = Character.toLowerCase(ch);
                vowels.put(lowerchar, vowels.getOrDefault(lowerchar, 0)+1);
            }
            if(Character.isLetter(ch) && "aeiouAEIOU".indexOf(ch) == -1){
                consonants.put(ch, consonants.getOrDefault(ch, 0)+1);
            }
            if(!Character.isLetter(ch)){
                specialCharacters.put(ch, specialCharacters.getOrDefault(ch, 0)+1);
            }
        }
        System.out.println("Vowles: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("specialCharacters: " + specialCharacters);
        
        int maxOcc = Integer.MIN_VALUE;
        int minOcc = Integer.MAX_VALUE;
        char minChar = ' ';
        char maxChar = ' ';

        for(Map.Entry<Character,Integer> entry : consonants.entrySet()){
            int occ = entry.getValue();
            char charac = entry.getKey();
            
            if(occ < minOcc){
                minOcc = occ;
                minChar = charac;
            }
            if(occ > maxOcc){
                maxOcc = occ;
                maxChar = charac;
            }
        }
        System.out.println("Max Occurence character is: " + maxChar+" and its occurence is: " + maxOcc);
        System.out.println("Min Occurence character is: " + minChar+" and its occurence is: " + minOcc);
    }
}
