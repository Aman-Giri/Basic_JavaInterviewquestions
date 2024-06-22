public class StringPalindrome {
    public static void main(String[] args) {
        String name = "Mama";
        System.out.println(checkPalindrome(name));
    }

    //Function to check the palindrome
    public static boolean checkPalindrome(String str){
        if(str.length() == 0 ){
            return false;
        }
        else if(str.length() == 1){
            return true;
        }
        else if(str.equalsIgnoreCase(reverseString(str))){
            return true;
        }
        else{
            return false;
        }
    }

    //Function to reverse the String
    public static String reverseString(String str){
        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
