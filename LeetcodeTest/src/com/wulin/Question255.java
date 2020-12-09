package com.wulin;

import java.util.LinkedList;
import java.util.Queue;

public class Question255 {
    public static void main(String[] args) {
        MyStack2 myStack = new MyStack2();
        myStack.push(2);
        myStack.push(9);
        myStack.push(6);
        System.out.println(myStack.empty());
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }
}

class MyStack{
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        queue1 = queue2;
        queue2 = new LinkedList<>();
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

class MyStack2{

    Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack2() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        for (int i = 0; i < queue.size()-1; i++) {
            queue.offer(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
