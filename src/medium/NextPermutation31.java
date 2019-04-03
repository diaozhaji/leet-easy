package medium;

import java.util.Arrays;

public class NextPermutation31 {

    //虽然 faster than 96.10%
    //Arrays.sort应该是不能使用的，题目要求不适用额外的空间
    public static void nextPermutation(int[] nums) {

        if (nums == null || nums.length < 2) {
            return;
        }
        if (nums.length == 2) {
            swap(nums, 0, 1);
            return;
        }

        int index = nums.length - 1;
        int left = -1;
        while (index > 0) {

            if (nums[index] > nums[index - 1]) {
                left = index - 1;
                break;
            } else {
                index--;
            }

        }
        if (left == -1) {
            Arrays.sort(nums);
            return;
        } else {
            int min = nums[left + 1];
            int right = left + 1;

            //找比该位大的中，最小的
            for (int i = left + 1; i < nums.length; i++) {

                if (nums[i] > nums[left] && nums[i] < min) {
                    min = nums[i];
                    right = i;
                }
            }
            swap(nums, left, right);

            Arrays.sort(nums, left + 1, nums.length);
        }

    }

    public static void swap(int[] nums, int i, int j) {
        if (i < nums.length && j < nums.length) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }


}
