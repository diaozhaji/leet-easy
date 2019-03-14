package hard;

import java.util.Arrays;

public class MedianofTwoSortedArrays4 {

    //拼起来再排序其实是不符合要求的，但是 faster than 49.93%
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0) {
            return mid(nums2);
        }
        if (nums2.length == 0) {
            return mid(nums1);
        }

        int[] r = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            r[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            r[nums1.length + i] = nums2[i];
        }
        Arrays.sort(r);

        return mid(r);
    }

    public static double mid(int[] nums1) {
        if (nums1.length == 0) {
            return 0;
        }

        int n = nums1.length;

        if (n % 2 == 0) {
            return (nums1[n / 2 - 1] + nums1[n / 2]) / 2.00;
        } else {
            return nums1[n / 2];
        }

    }


}
