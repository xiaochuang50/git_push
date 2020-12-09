package com.wulin;

import sun.security.util.Resources;

import java.io.InputStream;
import java.util.Stack;

public class Question232 {
    public static void main(String[] args) {
            MyQueue2 myQueue = new MyQueue2();
            myQueue.push(2);
            myQueue.push(9);
            myQueue.push(6);
            System.out.println(myQueue.empty());
        try {
            System.out.println(myQueue.peek());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(myQueue.pop());
            System.out.println(myQueue.pop());
            System.out.println(myQueue.pop());
        try {
            System.out.println(myQueue.peek());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(myQueue.empty());
    }
}


class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (stack1.isEmpty()){
            front = x;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(x);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int ans = stack1.pop();
        if (!stack1.isEmpty()){
            front = stack1.peek();
        }
        return ans;
    }

    /** Get the front element. */
    public int peek() {
        return stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}



class MyQueue2 {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int front;

    /** Initialize your data structure here. */
    public MyQueue2() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (stack1.isEmpty()){
            front = x;
        }
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() throws RuntimeException{
        if (!stack2.isEmpty()){
            return stack2.peek();
        }else if (!stack1.isEmpty()){
            return front;
        }else {
            throw new RuntimeException("栈为空");
        }

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}

