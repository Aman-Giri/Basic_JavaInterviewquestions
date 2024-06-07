

import java.util.Scanner;

import javafx.scene.control.Alert;

public class RevString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.nextLine();
        String rev = "";

        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }

        System.out.println("The reverse of the String is: " + rev);


    }
}
