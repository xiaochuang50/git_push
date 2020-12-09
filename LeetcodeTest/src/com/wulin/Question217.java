package com.wulin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question217 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        Solution217 solution217 = new Solution217();
        System.out.println(solution217.containsDuplicate1(arr));
    }
}


class Solution217{
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}