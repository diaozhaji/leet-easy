import easy.ValidParentheses20;
import struct.ListNode;

/**
 * @author jiyuan
 */
public class Easy {

    public static void main(String[] args) {
        System.out.println("Easy World");


        //14.
//        String[] in = {"flower", "flow", "flight"};
//        String[] in = {"aa", "a"};
//        System.out.println("最大公共前缀：" + easy.LongestCommonPrefix14.longestCommonPrefix(in));

        //20.
        String s = "()]([){}";
        System.out.println(ValidParentheses20.isValid1(s));

        //21.
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(0);
        ListNode r3 = new ListNode(1);

        r1.next = r2;
        r2.next = r3;
        r3.next = l3;


//        struct.Utils.logList(easy.MergeTwoSortedLists21.mergeTwoLists(l1, r1));

        //28.
//        System.out.println(ImplementStrStr.strStr("hello","aa"));


        //35.
//        int[] nums = {1, 3, 5, 6};
//        System.out.println(easy.SearchInsertPosition35.searchInsert(nums, 0));

        //38.
//        System.out.println(easy.CountandSay38.countAndSay(9));

        //67.
//        System.out.println(easy.AddBinary67.addBinary("1010", "1011"));

        //136
//        int[] a = {0,1,0,1,0,1,99};
//        System.out.println(easy.SingleNumber136.singleNumber2(a));

        //121
//        int[] a = {7, 1, 5, 3, 6, 4};
//        System.out.println(easy.BestTimetoBuyandSellStock121.maxProfit(a));


        //13.
//        String s = "LVIII";
//        System.out.println(easy.RomantoInteger13.romanToInt(s));

        //118.
//        System.out.println(easy.PascalTriangle118.getRow1(3));

        //160.
//        System.out.println(easy.IntersectionofTwoLinkedLists160.getIntersectionNode(l1, r1).val);

        //167.
//        int[] a = {2, 7, 11, 15};
//        System.out.println(easy.TwoSumSorted167.twoSum(a, 22));

        //168.
//        System.out.println(easy.ExcelSheetColumnTitle168.convertToTitle(27));

        //169.
//        int[] a = {1,2,2,2,2,2,3,4,2,4,1};
//        System.out.println(easy.MajorityElement169.majorityElement1(a));


    }


}
