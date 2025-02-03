import java.util.HashSet;

public class FindAllDuplicatesinArrayofInteger {
    public static void main(String[] args) {
        int[] arr = {1,4,6,6,7,8,8,9,9,10,13,13};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("All the duplicates numbers are: " + duplicates);
    }

    // SIMILARLY TWE CAN FIND THE DUPLICATE CHARACTER IN THE STRING BY CONVERTING THE STRING INTO THE STRING AND THEN
    // FOLLOWING THE ABOVE APPROACH
}
