package 剑指offer.栈的压入弹出序列;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author Kohath
 */
public class Code {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int top = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek() == popped[top]) {
                top++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
