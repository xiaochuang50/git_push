package com.wulin;

public class Question0106 {
    public static void main(String[] args) {
        String S = "aabcccccaaa";
        System.out.println(new Solution0106().compressString(S));
    }
}


class Solution0106{
    public String compressString(String S) {
        if (S.length() == 0){
            return S;
        }
        StringBuffer ans = new StringBuffer();
        char c = S.charAt(0);
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (c == S.charAt(i)){
                count++;
            }else {
                ans.append(c);
                ans.append(count);
                c = S.charAt(i);
                count = 1;
            }
        }
        ans.append(c);
        ans.append(count);
        return ans.length() < S.length()? ans.toString() : S;
    }
}