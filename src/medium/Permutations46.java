package medium;

import java.util.LinkedList;
import java.util.List;

public class Permutations46 {
    // faster than 48.55%
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();

        List<Integer> item = new LinkedList<>();

        permute(result, item, nums, 0);

        return result;
    }

    private static void permute(List<List<Integer>> result,
                                List<Integer> item, int[] nums, int index) {

        if (index == nums.length) {
            result.add(new LinkedList<>(item));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (item.contains(nums[i])) //这个为什么可以如此判重？
                continue;
            item.add(nums[i]);
            permute(result, item, nums, index + 1);
            item.remove(item.size() - 1);
        }


    }

}
