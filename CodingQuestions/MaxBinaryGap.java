public class MaxBinaryGap {
    public static void main(String[] args) {
        int number = 1041;
        String binaryform = Integer.toBinaryString(number);
        System.out.println("Binary form of the number: " + binaryform);
        String[] gaps = binaryform.split("1");
        int maxGap = 0;
        for(int i=0;i<gaps.length-1;i++){
            maxGap = Math.max(maxGap, gaps[i].length());
        }
        System.out.println("The maximum binary gap is: " + maxGap);
    }
}
