package com.wulin;

import java.util.Stack;

public class Question155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

class MinStack {
    Stack<Integer> xstack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        xstack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xstack.push(x);
        minStack.push(Math.min(x,minStack.peek()));
    }

    public void pop() {
        xstack.pop();
        minStack.pop();
    }

    public int top() {
        return xstack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
