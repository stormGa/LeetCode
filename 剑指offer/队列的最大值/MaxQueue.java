package 剑指offer.队列的最大值;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class MaxQueue {
    Deque<Integer> deque;
    Deque<Integer>  max;
    public MaxQueue() {
        deque = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if (max.isEmpty()) {
            return -1;
        }
        return max.getFirst();
    }

    public void push_back(int value) {
        deque.addLast(value);
        while (!max.isEmpty() && value > max.getLast()) {
            max.pollLast();
        }
        max.addLast(value);
    }

    public int pop_front() {
        if (deque.isEmpty()) {
            return -1;
        }
        int x = deque.removeFirst();
        if (x == max.getFirst()) {
            max.pollFirst();
        }
        return x;
    }
}