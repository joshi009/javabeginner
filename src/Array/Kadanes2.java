package Array;

public class Kadanes2 {
    public static void kadanes2(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
                currSum = currSum + arr[i];
                if(currSum < 0) {
                    currSum = 0;
                }

                // Update maxSum if currSum is greater than maxSum
                maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        kadanes2(arr);
    }
}
