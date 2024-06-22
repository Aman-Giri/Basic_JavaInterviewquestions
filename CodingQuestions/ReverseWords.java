

public class ReverseWords {
    public static void main(String[] args) {
        String str = "My name is Aman and he is a very good boy in the world";
        String[] words = str.split(" ");
        System.out.println("Number of words in the String are: " + words.length);
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
