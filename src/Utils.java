public class Utils {

    public static void logList(ListNode head) {
        if (head != null) {
            System.out.println(head.val);

            if (head.next != null) {
                logList(head.next);
            }
        }
    }
}
