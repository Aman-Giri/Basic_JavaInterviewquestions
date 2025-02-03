import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int size = 5;

        List<Integer> result = findmissing(arr, size);
        System.out.println(result);
    }

    //function to find the missing the number in the array
    public static List<Integer> findmissing(int[] arr, int size){
        List<Integer> missing = new ArrayList<Integer>();

        //add the number in the list
        for(int i=1;i<=size;i++){
            missing.add(i);
        }

        //remove the number from the list
        for(int num : arr){
            missing.remove((Integer) num);
        }

        return missing;
    }
}
