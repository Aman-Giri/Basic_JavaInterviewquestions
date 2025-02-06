import java.util.*;
public class FirstNonDuplicateNumberinArray {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5,5,4,9,11,1};
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First nonDuplicate number in the Array is: " + entry.getKey());
                break;
            }
        }
    }
}
