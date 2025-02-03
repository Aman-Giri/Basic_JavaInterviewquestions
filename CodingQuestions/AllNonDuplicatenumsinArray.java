import java.util.ArrayList;
import java.util.List;

public class AllNonDuplicatenumsinArray {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,5,6,7,21,21,100};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i==0||arr[i] != arr[i-1] && (i==arr.length-1 || arr[i] != arr[i+1])){
                list.add(arr[i]);
            }
        }
        System.out.println("All Non duplicates inside the array are: " + list);
    }
}
