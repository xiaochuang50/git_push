package com.wulin;

import java.util.Stack;

public class Question71 {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(new Solution71().simplifyPath(path));
    }
}

class Solution71{
    public String simplifyPath(String path){
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        for (String s : str){
            if (s.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else if (!s.equals("") && !s.equals(".")){
                stack.push(s);
            }
        }
        if (stack.isEmpty()){
            return "/";
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            ans.append("/"+stack.get(i));
        }
        return ans.toString();
    }
}
