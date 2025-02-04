import java.util.*;

public class AlternateReverse {
public static void main(String[] args) {
    //Do the Alternate reverse for the above String
     //Also make the first letter of the reversed word as capital
        String input = "Aman Kumar Giri Goswami";
        String[] words = input.split(" ");
        String result = "";
        String revResult = "";
        for(int i=0;i<words.length;i++){
            if(i%2!=0){
                revResult = revString(words[i]);
                revResult = Character.toUpperCase(revResult.charAt(0))+revResult.substring(1);
            }else{
                revResult = words[i];
            }
            result += revResult + " "; 
        }

        System.out.println("Result: " + result);
        String result1 = result.trim();
        System.out.println("Length: " + input.length());
        System.out.println("Length: " + result1.length());

    }

    //Function to reverse the String
    public static String revString(String str){
        String str1 = str.toLowerCase();
        String rev = "";
        for(int i=str1.length()-1;i>=0;i--){
            rev += str1.charAt(i);
        }

        return rev;
    }

    //Function to reverse the String using StringBuilder
    public static String revString2(String str){
        StringBuilder sb = new StringBuilder(str.toLowerCase()).reverse();
        return sb.toString();
    }
}
