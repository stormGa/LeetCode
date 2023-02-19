package 剑指offer.两个栈实现队列;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Kohath
 */
public class CQueue {
    class Stack{
        List<Integer> list = new ArrayList<Integer>();
        int index = 0; //下标

        //入栈
        public void push(int n){
            list.add(n);
            index++;
        }

        //出栈
        public int pop(){
            if(!list.isEmpty()){
                index--;
                return list.remove(index);
            }
            return -1;
        }
        public boolean empty() {
            return list.size() == 0;
        }
    }
    Stack stA ;
    Stack stB;
    public CQueue() {
        stA = new Stack();
        stB = new Stack();
    }

    public void appendTail(int value) {
        stA.push(value);
    }

    public int deleteHead() {
        if (stB.empty()) {
            while (!stA.empty()) {
                stB.push(stA.pop());
            }
            if (stB.empty()) {
                return -1;
            } else {
                return stB.pop();
            }
        } else {
            return stB.pop();
        }
    }

}
