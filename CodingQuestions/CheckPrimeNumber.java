import java.util.*;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int number = sc.nextInt();

        if(isPrime(number) == true){
            System.out.println(number+" is prime number");
        }else{
            System.out.println(number+" is not prime number");
        }
    }

    //function to check the prime number: 
    public static boolean isPrime(int number){
        if(number < 2) return false; // number less than 2 is not prime and also 2 is the smallest prime number
        for(int i=2;i*i<=number;i++){
            if(number%i==0)return false; // not prime
        }
        return true; //prime number
    }
}
