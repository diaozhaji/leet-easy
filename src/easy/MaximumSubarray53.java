package easy;

public class MaximumSubarray53 {


    //看答案的Kadane算法 faster than 99.64%
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int x = nums[0];
        int y = nums[0];
        for (int i = 1; i < nums.length; i++) {
            y = Math.max(y + nums[i], nums[i]);
            x = Math.max(x, y);
        }
        return x;

    }

}
