package 剑指offer.复杂链表的复制;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kohath
 */
public class Code {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    /**
     * 复制一个复杂链表。
     * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
     *
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node recur = head;
        Map<Node, Node> map = new HashMap<>();
        while (recur != null) {
            map.put(recur, new Node(recur.val));
            recur = recur.next;
        }
        recur = head;
        while (recur != null) {
            map.get(recur).next = map.get(recur.next);
            map.get(recur).random = map.get(recur.random);
            recur = recur.next;
        }
        return map.get(head);
    }

    /**
     * 原地复制
     */
    public Node copyRandomList2(Node head) {
        if (head == null) {
            return null;
        }
        Node recur = head;
        while (recur != null) {
            Node tmp = new Node(recur.val);
            tmp.next = recur.next;
            recur.next = tmp;
            recur = tmp.next;
        }
        recur = head;
        while (recur != null) {
            if (recur.random != null) {
                recur.next.random = recur.random.next;
            }
            recur = recur.next.next;
        }
        recur = head.next;
        Node pre = head, res = head.next;
        while (recur.next != null) {
            pre.next = pre.next.next;
            recur.next = recur.next.next;
            pre = pre.next;
            recur = recur.next;
        }
        pre.next = null;
        return res;
    }

}
