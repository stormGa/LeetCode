package 剑指offer.包含min函数的栈;

import java.util.LinkedList;

/**
 * @author Kohath
 */
public class MinStack {
    /**
     * initialize your data structure here.
     */
    int[] stack;
    int top;

    int[] minstack;
    int min;

    public MinStack() {
        minstack = new int[20000];
        stack = new int[20000];
        top = -1;
        min = -1;
    }


    public void push(int x) {
        top++;
        stack[top] = x;

        if (min == -1 || x <=minstack[min]) {
            min++;
            minstack[min] = x;
        }
    }



    public void pop() {
        if (stack[top] == minstack[min]) {
            min--;
        }
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int min() {
        return minstack[min];
    }
}