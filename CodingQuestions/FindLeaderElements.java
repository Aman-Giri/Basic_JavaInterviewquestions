import java.util.*;
public class FindLeaderElements {
    // A leader element is an element that is greater than or equal to all the elements to its right in the array.
    public static void main(String[] args) {
        int[] arr = {10,4,8,7,6};
        int maxFromRight = arr[arr.length-1];
        List<Integer> list = new ArrayList<>();
        list.add(maxFromRight);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > maxFromRight){
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        System.out.println(list);

        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
