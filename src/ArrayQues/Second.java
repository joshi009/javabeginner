package ArrayQues;

public class Second {
    public static int array(int[] nums) {
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i])
            {
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(array(arr));

    }
}
