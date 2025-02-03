public class PrintFibonacciNumber {
    public static void main(String[] args) {
        //Fibonacci series 
        int n =10;
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series upto " + n + " numbers: ");
        for(int i=0;i<n;i++){
            System.out.print(first + " ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
}
