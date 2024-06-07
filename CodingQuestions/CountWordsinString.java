

public class CountWordsinString {
    public static void main(String[] args) {
        String str = "My name is Aman and I am preparing for the switch";
        int count = 1;
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("The number of words in the String are: " + count);
    }
}
