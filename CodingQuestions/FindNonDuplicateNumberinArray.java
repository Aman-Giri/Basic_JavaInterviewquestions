import java.util.Arrays;

public class FindNonDuplicateNumberinArray {
    public static void main(String[] args) {
        int[] numbers = {8, 4, 9, 4, 9, 8, 3,3,1};
        Arrays.sort(numbers);
        int nonDuplicate = -1;
        for(int i=0;i<numbers.length-2;i=i+2){
            if(numbers[i] != numbers[i+1]){
                nonDuplicate = numbers[i];
                break;
            }
        }
        if(nonDuplicate == -1){
            nonDuplicate = numbers[numbers.length-1];
        }
        System.out.println("Non Duplicate number is: " + nonDuplicate);
    }
    }

