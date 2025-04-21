package Array.Striver;

public class Rotate_Left_By_One {

    public static class Solution {
        public void rotateArrayByOne(int[] nums) {
            if (nums == null || nums.length <= 1)
                return;

            int temp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        Solution solution = new Solution();
        solution.rotateArrayByOne(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
