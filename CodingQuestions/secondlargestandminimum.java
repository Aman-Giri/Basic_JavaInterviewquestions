import java.util.Arrays;

public class secondlargestandminimum {
    public static void main(String[] args) {
        int[] arr = {45,22,44,90,4,33};
       // Arrays.sort(arr);
        int temp;

        //Function to sort the array without using the inbuilt function
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Second largest number: " + arr[arr.length-2]);
        System.out.println("second minimum number: " + arr[1]);
    }
}
