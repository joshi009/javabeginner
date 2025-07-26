package Bs;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end= nums.length-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==nums[mid-1])
            {
                if((mid-1)%2!=0)
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            if(nums[mid]!=nums[mid-1])
            {
                if(mid%2!=0)
                {
                    end=mid-2;
                }
                else{
                    start=mid+2;
                }
            }
            else{
                return nums[mid];
            }
        }
        return nums[start];

    }
}
