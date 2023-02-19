package 剑指offer.合并两个排序的链表;

import java.util.List;

/**
 * @author Kohath
 */
public class Code {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head , cur ;
        head = new ListNode(-1);
        cur= head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = new ListNode(l1.val);l1 = l1.next;
            }else {
            cur.next = new ListNode(l2.val); l2 = l2.next;}


            cur =cur.next;
        }
        if (l1 == null) {
            cur.next = l2;
        }
        if (l2 == null) {
            cur.next = l1;
        }
        return head.next;
    }
}
