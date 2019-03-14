package medium;

public class ContainerWithMostWater11 {


    //AC，但faster than 24.21% O(n^2)
    public static int maxArea(int[] height) {
        int sum = 0;
        int s = 0;
        for (int i = 0; i < height.length; i++) {

            for (int j = i; j < height.length; j++) {

                s = (j - i) * Math.min(height[i], height[j]);
                if (s > sum) {
                    sum = s;
                }
            }
        }
        return sum;

    }

    //抄了一个差不多能想清楚的，faster than 95.68%
    public static int maxArea1(int[] height) {

        int sum = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            sum = Math.max(sum, (j - i) * Math.min(height[i], height[j]));

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return sum;

    }


}
