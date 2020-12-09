package com.wulin;

public class Question38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        String say = solution38.countAndSay(4);
        System.out.println(say);
    }
}

class Solution38{
    public String countAndSay(int n){
        StringBuffer pre;
        StringBuffer cur = new StringBuffer("1");
        for (int i = 1; i < n; i++) {
            pre = cur;
            cur = new StringBuffer();
            int start = 0;
            int end = 0;
            while (end < pre.length()){
                while (end < pre.length() && pre.charAt(start) == pre.charAt(end)){
                    end++;
                }
                cur = cur.append(end-start).append(pre.charAt(start));
                start = end;
            }
        }
        return cur.toString();
    }
}