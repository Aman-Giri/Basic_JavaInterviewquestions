

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

//Another Approach: 
// class Main {
//     public static void main(String[] args) {
//         String input = "Aman Kumar Giri Goswami";
//         String[] words = input.split(" ");
//         String revWords = "";
//         String revStringFinal = "";
        
//         for(int i=0;i<words.length;i++){
//             revWords = revString(words[i]);
//             revStringFinal += revWords + " ";
//         }
//         System.out.println("The Result is: " + revStringFinal);
//     }
    
//     //function to reverse the string
//     public static String revString(String str){
//         String revResult = "";
//         for(int i=str.length()-1;i>=0;i--){
//             revResult += str.charAt(i);
//         }
//         return revResult;
//     }
// }
