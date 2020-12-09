package com.wulin;

public class Question605 {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,0,0,1};
        int n = 1;
        Solution605 solution605 = new Solution605();
        System.out.println(solution605.canPlaceFlowers(flowerbed,n));
    }
}

class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i==0||flowerbed[i-1]==0) && (i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n){
                return true;
            }
        }
        return false;
    }
}
