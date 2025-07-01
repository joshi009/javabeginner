package Array.Questions;

public class maxsubarraysum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int sum(int nums[] ){
        int max=-1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                int s=0;
                for (int k = i; k <=j; k++) {
                    s+=nums[k];

                }
                max=Math.max(max,s);
            }
        }
        return max;
    }

}
