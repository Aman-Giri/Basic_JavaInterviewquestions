
public class CharacterOccurence {
    public static void main(String[] args) {
        String str = "Welcome to Programming";
        int totallength = str.length();
        int lengthwithoutm = str.replace("m", "").length();

        System.out.println("Total occurence of the character m is: " + (totallength-lengthwithoutm));
    }
}
