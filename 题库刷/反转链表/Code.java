package 题库刷.反转链表;

/**
 * @author Kohath
 * @desc leetcode.206
 */
public class Code {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = head;
        ListNode cur = null;
        if (head != null) {
            cur = pre.next;
        }
        while (cur != null) {
            pre.next = cur.next;
            cur.next = head;
            head = cur;
            cur = pre.next;
        }
        return head;
    }

    //todo
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //添加一个头节点
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        head = tmp;
        //指针 定位。
        ListNode l ,r = head.next,pre=head;
        for (int i = 1; i < right; i++) {
            if (i < left) {
                pre = pre.next;
            }
            r = r.next;
        }
        l = pre.next;
        //划分成两个链表 pre是p，q是第二部分的开头
        pre.next = r.next;
        r.next = null;
        while (l != null) {
            r = l.next;
            l.next = pre.next;
            pre.next = l;
            l =r;
        }
        return head;

    }
}
