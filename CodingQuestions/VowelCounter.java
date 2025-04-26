public class VowelCounter {
    public static void main(String[] args) {
        String word = "Aman";
        System.out.println("Number of vowels in word is: " + countV(word));
    }

    //Function to count the vowel in any word
    public static int countV(String word){
       word = word.toLowerCase();
        int vowelCount = 0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }

        return vowelCount;
    }

}
