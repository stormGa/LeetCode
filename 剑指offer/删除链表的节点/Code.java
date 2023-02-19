package 剑指offer.删除链表的节点;

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
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     * 输入: head = [4,5,1,9], val = 5
     * 输出: [4,1,9]
     *
     * @param head
     * @param val
     * @return 返回删除后的链表的头节点。
     */
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head,cur = pre.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                return head;
            }
            pre = pre.next;
            cur = cur.next;
        }
        return null;
    }
}
