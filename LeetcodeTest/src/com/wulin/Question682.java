package com.wulin;

import java.util.Stack;

public class Question682 {
    public static void main(String[] args) {
        String[] arr = new String[]{"5","2","C","D","+"};
        Solution692 solution692 = new Solution692();
        int points = solution692.calPoints(arr);
        System.out.println(points);
    }
}


class Solution692 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (String op : ops){
            switch (op){
                case "C":
                    ans -= stack.pop();
                    break;
                case "D":
                    stack.push( stack.peek()*2);
                    ans += stack.peek();
                    break;
                case "+":
                    Integer top = stack.pop();
                    Integer newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    ans += newTop;
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    ans += Integer.parseInt(op);
            }
        }
        return ans;
    }
}