package me.anpeng.stack;

import java.util.Stack;

/**
 * @ClassName: LeetCode_232_StackImplementQueue.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/30 21:31
 */
public class LeetCode_232_StackImplementQueue {
    public static class StackImplementQueue{
        private static Stack<Integer> inStack;
        private static Stack<Integer> outStack;

        public StackImplementQueue(){
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(Integer x){
            inStack.push(x);
        }

        public int pop(){
            if(outStack.isEmpty()){
                in2out();
            }
            return outStack.pop();
        }

        public int peek(){
            if(outStack.isEmpty()){
                in2out();
            }
            return outStack.peek();
        }

        public boolean empty(){
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void in2out() {
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }
}
