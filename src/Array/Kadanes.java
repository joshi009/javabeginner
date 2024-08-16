package Array;
import java.util.*;



public class Kadanes {
    public static void maxSubarraySum(int numbers[] ){
        int carrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                carrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < carrSum){
                    maxSum = carrSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void kadanes(int numbers[] ){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : " + ms );
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(numbers);
    }
}
