package medium;

import struct.ListNode;

public class RemoveNthNodeFromEndList19 {


    //faster than 100.00%
    //我自己竟然写出这种算法...数一下数竟然是最快的......
    //正常还是应该双指针，一个走1一个走2
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        int count = 0;

        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count == n) {
            head = head.next;
            return head;
        }

        temp = head;
        int index = 0;
        while (temp != null) {
            if (index == count - n - 1) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
            index++;
        }


        return head;

    }
}
