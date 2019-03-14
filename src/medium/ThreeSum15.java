package medium;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {

        //排序
        Arrays.sort(nums);

        //准备数据
        List<List<Integer>> result = new LinkedList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        //创建HashMap
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> l = new LinkedList<>();
                l.add(i);
                map.put(nums[i], l);
            } else {
                map.get(nums[i]).add(i);
            }
        }

        //求2个数的和，找第3个数
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                sum2 = (nums[i] + nums[j]) * (-1);
                if (map.containsKey(sum2)) {
                    boolean used = false;
                    for (int k = 0; k < map.get(sum2).size(); k++) {
                        int a = map.get(sum2).get(k);
                        if (i == a || j == a) {
                            used = true;
                        }
                    }
                    if (!used) {
                        List<Integer> item = new LinkedList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(sum2);
                        result.add(item);
                    }

                }

            }

        }
        return result;

    }
}
