package com.wulin;

import java.util.Arrays;

public class Qeustion832 {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        Solution832 solution832 = new Solution832();
        A = solution832.flipAndInvertImage(A);
        for (int[] row : A){
            System.out.println(Arrays.toString(row));
        }
    }
}


class Solution832{
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A[0].length;
        for (int[] row : A){
            for (int i = 0; i < (n+1)/2; i++) {
                int tmp = row[i]^1;
                row[i] = row[n-i-1]^1;
                row[n-i-1] = tmp;
            }
        }
        return A;
    }
}
