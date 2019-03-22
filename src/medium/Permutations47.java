package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations47 {

    //faster than 83.98%
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();

        List<Integer> item = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
        Arrays.sort(nums);

        permute(result, item, nums, used, 0);

        return result;
    }

    private static void permute(List<List<Integer>> result,
                                List<Integer> item, int[] nums, boolean[] used, int index) {

        if (index == nums.length) {
            result.add(new LinkedList<>(item));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                continue;
            }
            item.add(nums[i]);
            used[i] = true;
            permute(result, item, nums, used, index + 1);
            item.remove(item.size() - 1);
            used[i] = false;
        }


    }


}
