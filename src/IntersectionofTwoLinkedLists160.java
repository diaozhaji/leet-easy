public class IntersectionofTwoLinkedLists160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        int m = 0, n = 0;

        while (a != null) {
            a = a.next;
            m++;
        }
        while (b != null) {
            b = b.next;
            n++;
        }
        a = headA;
        b = headB;

        if (m > n) {
            for (int i = 0; i < m - n; i++) {
                a = a.next;
            }
        }

        if (m < n) {
            for (int i = 0; i < n - m; i++) {
                b = b.next;
            }
        }
        while (a != null) {
            if (a == b) {
                return a;
            } else {
                a = a.next;
                b = b.next;
            }
        }
        return null;


    }


}
