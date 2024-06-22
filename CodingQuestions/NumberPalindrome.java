public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 1214;
        System.out.println(checkPalindrome(number));
    }

    //Function to check the palindrome number
    public static boolean checkPalindrome(int number){
        if(number <=0){
            return false;
        }
        else if(number == reverseNumber(number)){
            return true;
        }
        else{
            return false;
        }
    }

    //function to reverse the number 
    public static int reverseNumber(int number){
        int rev = 0;

        while(number != 0){
            rev = rev*10 + number%10;
            number = number/10;
        }

        return rev;
    }
}
