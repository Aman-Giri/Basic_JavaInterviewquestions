import java.util.*;
public class FirstNonDuplicateNumberinArray {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,5,5,4,9,11,1};
        //We used Linkedhashmap here bcz of its sorted nature
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

//Another Approach: 

//Find the first non duplicate number in the Array: 
// class Main {
//     public static void main(String[] args) {
//          int[] arr = {1,3,3,4,5,5,4,9,11,1};
//          List<Integer> nonD = new ArrayList<>();
//          Arrays.sort(arr);
//          int count = 0;
//          for(int i=0;i<arr.length;i++){
//              if((i==0||arr[i]!=arr[i-1])&&(i==arr.length-1||arr[i]!=arr[i+1])){
//                  nonD.add(arr[i]);
//                  count++;
//                  if(count == 1){
//                      break;
//                  }
//              }
//          }
//          System.out.println("First nonDuplicate is: " + nonD);
//     }
// }
