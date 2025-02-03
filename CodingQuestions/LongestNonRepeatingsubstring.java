import java.util.*;
public class LongestNonRepeatingsubstring {
    public static void main(String[] args) {
        String input = "abcabcdcc";
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;
        int subStringstartIndex = 0;

        for(int end = 0;end < input.length();end++){
            char currentChar = input.charAt(end);

            while(set.contains(currentChar)){
                set.remove(input.charAt(start));
                start++;
            }

            set.add(currentChar);

            //update the maxlength and subStringstartIndex eachtime
            if(end-start+1 > maxLength){
                maxLength = end-start+1;
                subStringstartIndex = start;
            }
        }

        String longestSubstring = input.substring(subStringstartIndex, subStringstartIndex+maxLength);
        System.out.println("Longest Substring is: " + longestSubstring);
        System.out.println("The max length of longest substring is: " + maxLength);
    }
}
