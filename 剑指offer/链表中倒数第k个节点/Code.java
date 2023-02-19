package 剑指offer.链表中倒数第k个节点;

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
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode start = head, end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end.next != null) {
            start = start.next;
            end= end.next;
        }
        return start;
    }
}
