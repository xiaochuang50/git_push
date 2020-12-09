package com.wulin;

import java.util.Arrays;

public class Question867 {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        Solution867 solution867 = new Solution867();
        int[][] transArr = solution867.transpose(A);
        for (int i = 0; i <transArr.length; i++) {
            System.out.println(Arrays.toString(transArr[i]));
        }
    }
}

class Solution867{
    public int[][] transpose(int[][] A) {
        int[][] ans = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++){
                ans[j][i] = A[i][j];
            }
        }
        return ans;
    }
}
