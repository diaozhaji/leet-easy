public class SingleNumber136 {

    //这个方法不是最好的
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    break;
                } else if (nums[j] == nums[i]) {
                    nums[i] = 0;
                    nums[j] = 0;
                    break;
                }
            }
        }

        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            r += nums[i];
        }

        return r;
    }

    //利用异或的性质
    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    //137题，同样的道理能解，但是最好研究下更好更通用的办法
    public static int singleNumber2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int flag = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    break;
                } else if (nums[j] == nums[i]) {
                    flag = i;
                    nums[j] = 0;
                }
            }
            if (flag >= 0) {
                nums[flag] = 0;
            }
        }

        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            r += nums[i];
        }

        return r;
    }
}
