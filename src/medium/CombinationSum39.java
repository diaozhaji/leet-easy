package medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> result = new LinkedList<>();
        List<Integer> item = new LinkedList<>();
//        combinationSum(result, null, candidates, target);
        dfs(result, item, target, candidates, 0);

        return result;
    }

    //这个方法没有考虑重复的问题
    private static void combinationSum(List<List<Integer>> result, List<Integer> item, int[] candidates, int target) {

        if (item == null) {
            item = new LinkedList<>();
        }

        if (sum(item) == target) {
            result.add(new LinkedList<>(item));//这是最关键的逻辑
            return;
        } else if (sum(item) > target) {
            return;
        } else {
            for (int i = 0; i < candidates.length; i++) {
                if (sum(item) + candidates[i] <= target) {
                    item.add(candidates[i]);
                    combinationSum(result, item, candidates, target);
                    item.remove(item.size() - 1);
                }
            }
        }

    }

    private static int sum(List<Integer> item) {
        int sum = 0;
        for (int i = 0; i < item.size(); i++) {
            sum += item.get(i);
        }
        return sum;
    }


    //抄的一个，faster than 95.70%
    private static void dfs(List<List<Integer>> res, List<Integer> temp, int target,
                            int[] candidates, int j) {
        if (target == 0) {  //满足条件，将中间集加入结果集
            res.add(new LinkedList<>(temp));
        }
        for (int i = j; i < candidates.length && target >= candidates[i]; i++) {  //target>=candidates[i]是剪枝操作
            temp.add(candidates[i]);
            dfs(res, temp, target - candidates[i], candidates, i);
            temp.remove(temp.size() - 1);
        }
    }


}
