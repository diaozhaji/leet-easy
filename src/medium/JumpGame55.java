package medium;

public class JumpGame55 {

    //看起来可以动态规划，但不会
    //因为没有要求是最优的解，因此贪心可以解决
    //自己写的不行，抄的答案！！faster than 100.00%
    public static boolean canJump(int[] nums) {

        int max = 0, i = 0;
        for(i = 0; i <= max && i < nums.length; i++){   //用i<max来控制能不能再走
            max = Math.max(max, nums[i] + i);
        }
        return i == nums.length;
    }


}
