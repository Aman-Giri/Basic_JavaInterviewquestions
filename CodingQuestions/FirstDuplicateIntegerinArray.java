import java.util.HashSet;

public class FirstDuplicateIntegerinArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,6,7,8,8,9,9,10,13,13};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        int count = 0;
        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
                count++;
                if(count == 1){
                    break;
                }
            }
        }
        System.out.println("First duplicate numbers are: " + duplicates);
    }
}
