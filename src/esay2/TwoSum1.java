package esay2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    //空间换时间，faster than 71.02%
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        int cha = 0;
        for (int i = 0; i < nums.length; i++) {
            cha = target - nums[i];
            //一个数只能用一次，并且数组中可能有重复的值
            if (map.containsKey(cha) && i != map.get(cha)) {
                result[0] = Math.min(i, map.get(cha));
                result[1] = Math.max(i, map.get(cha));
            }
        }
        return result;
    }

}
