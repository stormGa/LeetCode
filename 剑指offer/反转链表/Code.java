package 剑指offer.反转链表;

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

    /**
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * 不带头节点
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p,q ;
        p = head.next;
        head.next = null;
        while (p != null) {
            q = p.next;
            p.next = head;
            head = p;
            p = q;
        }
        return head;
    }

    /**
     * 带头节点
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode root = new ListNode(-1);
        ListNode p, q, l;
        p = root.next;
        q = p.next;
        p.next = null;
        while (q != null) {
            l = q.next;
            p.next = root.next;
            root.next=q;
            q=l;
        }
    return root.next;
    }
}
