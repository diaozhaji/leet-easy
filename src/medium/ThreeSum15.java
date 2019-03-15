package medium;

import java.util.*;

public class ThreeSum15 {


    //faster than 92.47%
    //用了167的思维
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();

        if (nums.length < 3) {
            return result;
        }

        //排序
        Arrays.sort(nums);
        //sum 2
        int sum2;
        int target;
        int left;
        int right;
        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                sum2 = nums[left] + nums[right];
                target = nums[i] * (-1);
                if (sum2 < target) {
                    left++;
                } else if (sum2 > target) {
                    right--;
                } else {
                    List<Integer> item = new LinkedList<>();
                    item.add(nums[i]);
                    item.add(nums[left]);
                    item.add(nums[right]);
                    result.add(item);
                    left++;
                    right--;
                    //去重非常麻烦！
                    while (nums[left - 1] == nums[left] && left < right) {
                        left++;
                    }
                    while (nums[right + 1] == nums[right] && right > left) {
                        right--;
                    }
                }
            }
        }
        return result;

    }


    //超时
    public List<List<Integer>> threeSum1(int[] nums) {
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
                        } else {
                            used = false;
                        }
                    }
                    if (!used) {
                        List<Integer> item = new LinkedList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(sum2);
                        Collections.sort(item);
                        if (!has(result, item)) {
                            result.add(item);
                        }
                    }

                }
            }

        }
        return result;
    }

    //超时主要是这个方法有问题
    private boolean has(List<List<Integer>> list, List<Integer> item) {
        if (list == null || list.size() == 0) {
            return false;
        }
        boolean isSame;
        for (int i = 0; i < list.size(); i++) {
            isSame = true;
            if (list.get(i).size() == item.size()) {
                for (int j = 0; j < item.size(); j++) {
                    if (list.get(i).get(j).intValue() != item.get(j).intValue()) {
                        isSame = false;
                        break;
                    }
                }
            } else {
                isSame = false;
            }
            if (isSame) {
                return true;
            }
        }

        return false;
    }


}
