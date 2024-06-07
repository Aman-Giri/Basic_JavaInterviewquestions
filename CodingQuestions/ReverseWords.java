

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is Aman";
        String[] words = str.split(" ");
        String reverseString = "";

        for(String word : words){
            String reverseWords = "";
            for(int i=word.length()-1;i>=0;i--){
                reverseWords = reverseWords + word.charAt(i);
            }

            reverseString = reverseString + reverseWords+" ";
        }

        System.out.println("The reverse words in String: " + reverseString);
    }
}
