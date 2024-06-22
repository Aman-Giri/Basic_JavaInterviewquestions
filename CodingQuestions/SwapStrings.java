

public class SwapStrings {
    public static void main(String[] args) {
        String a = "Aman";
        String b = "Giri";

        System.out.println(a);
        System.out.println(b);

        a = a+b;
        b = a.substring(0,(a.length()-b.length()));
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);

        
    }

    
}
