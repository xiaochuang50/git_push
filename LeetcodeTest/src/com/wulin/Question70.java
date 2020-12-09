package com.wulin;

public class Question70 {
    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(3));
    }
}

class Solution70 {
    //爬楼梯问题，就是斐波那契数列
    public int climbStairs(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
