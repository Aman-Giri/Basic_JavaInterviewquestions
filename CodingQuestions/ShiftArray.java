import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 2, 7, 4};
        int shift = 3;

       int[] result = shiftArray(arr, shift);
       System.out.println(Arrays.toString(result));
    }

    //Function to shift the array
    public static int[] shiftArray(int[] arr, int shift){
        int n = arr.length;
        int[] shiftedArray = new int[n];

        for(int i=0;i<n;i++){
            int newPosition = (i+shift)%n;
            shiftedArray[newPosition] = arr[i];
        }

        return shiftedArray;
    }
}
