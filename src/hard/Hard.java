package hard;

import struct.ListNode;

public class Hard {
    public static void main(String[] args) {
        System.out.println("Hard World");

        //4.
//        int[] nums1 = {1, 2, 4};
//        int[] nums2 = {3, 4};
//        System.out.println(MedianofTwoSortedArrays4.findMedianSortedArrays(nums1, nums2));


        //10.
//        System.out.println(RegularExpressionMatching10.isMatch("", ""));

        //23.
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(0);
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(4);
        ListNode m3 = new ListNode(5);
        n1.next = n2;
        m1.next = m2;
        m2.next = m3;
//
        ListNode[] lists = new ListNode[]{n1};
        ListNode r = MergeKSortedLists23.mergeKLists(lists);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

}
