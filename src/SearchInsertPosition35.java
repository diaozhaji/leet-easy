public class SearchInsertPosition35 {

    public static int searchInsert(int[] nums, int target) {


        if (target < nums[0]) {
            return 0;//最小
        }

        //在中间
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
