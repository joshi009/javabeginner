package ArrayQues;

import java.util.Arrays;

public class Third {
    public  static int array(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];

            } else {
                profit = Math.max(prices[i] - buy, profit);

            }
        }
        return profit;

    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(array(arr));
    }
    }
