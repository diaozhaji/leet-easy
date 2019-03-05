/**
 * @author jiyuan
 */
public class Easy {

    public static void main(String[] args) {
        System.out.println("Easy World");


        //14.
//        String[] in = {"flower", "flow", "flight"};
//        String[] in = {"aa", "a"};
//        System.out.println("最大公共前缀：" + LongestCommonPrefix14.longestCommonPrefix(in));

        //20.
//        String s = "([{(}])";
//        System.out.println(ValidParentheses20.isValid(s));

        //21.
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;
        r3.next = null;

//        Utils.logList(MergeTwoSortedLists21.mergeTwoLists(l1, r1));

        //28.
//        System.out.println(ImplementStrStr.strStr("hello","aa"));


        //35.
//        int[] nums = {1, 3, 5, 6};
//        System.out.println(SearchInsertPosition35.searchInsert(nums, 0));

        //38.
//        System.out.println(CountandSay38.countAndSay(9));

        //67.
//        System.out.println(AddBinary67.addBinary("1010", "1011"));

        //136
//        int[] a = {0,1,0,1,0,1,99};
//        System.out.println(SingleNumber136.singleNumber2(a));

        //121
//        int[] a = {7, 1, 5, 3, 6, 4};
//        System.out.println(BestTimetoBuyandSellStock121.maxProfit(a));


        //13.
        String s = "LVIII";
        System.out.println(RomantoInteger13.romanToInt(s));

        //118.
        System.out.println(PascalTriangle118.getRow1(3));



    }


}
