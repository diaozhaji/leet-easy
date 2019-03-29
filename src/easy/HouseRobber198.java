package easy;

public class HouseRobber198 {

    //看了答案 faster than 100.00%
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);

        if (nums.length == 2) {
            return b;
        }
        int result = 0;

        //关键是max这步，不用care是否用了num[i-1]
        for (int i = 2; i < nums.length; i++) {

            result = Math.max(b, a + nums[i]);
            a = b;
            b = result;
        }
        return result;


    }
}
