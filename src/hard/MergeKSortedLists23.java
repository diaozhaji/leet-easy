package hard;

import struct.ListNode;

import java.util.Collections;

public class MergeKSortedLists23 {

    //连起来再排，不成
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        if (lists.length == 1) {
            return lists[0];
        }

        ListNode end = null;
        ListNode head = null;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                end = lists[i];
                head = lists[i];
                break;
            }
        }
        if (end == null) {
            return null;
        }

        for (int i = 0; i < lists.length - 1; i++) {
            if (lists[i] == null) {
                continue;
            }

            if (end.next != null) {
                while (end.next != null) {
                    end = end.next;
                }
            }

            end.next = lists[i + 1];
        }

        while (end.next != null) {
            end = end.next;
        }
//        排序
        quickSort(head, end);
        return head;

    }

    public static void quickSort(ListNode head, ListNode end) {
        if (head != end) {
            ListNode node = partion(head, end);
            quickSort(head, node);
            quickSort(node.next, end);
        }
    }

    public static ListNode partion(ListNode head, ListNode end) {
        ListNode p1 = head, p2 = head.next;

        //走到末尾才停
        while (p2 != end) {

            //大于key值时，p1向前走一步，交换p1与p2的值
            if (p2.val < head.val) {
                p1 = p1.next;

                int temp = p1.val;
                p1.val = p2.val;
                p2.val = temp;
            }
            p2 = p2.next;
        }

        //当有序时，不交换p1和key值
        if (p1 != head) {
            int temp = p1.val;
            p1.val = head.val;
            head.val = temp;
        }
        return p1;
    }
}
