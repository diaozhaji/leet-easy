package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {


    //剑指offer，此方法不算好，faster than 38.02%
    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        int max = map.get(nums[0]);
        int key = nums[0];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }

        }
        return key;
    }

    //先排序，再取中，faster than 99.43%
    public static int majorityElement1(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length / 2;

        return nums[n];
    }

}
