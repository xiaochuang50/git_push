package com.wulin;

import java.util.*;

public class Question78 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution78 solution78 = new Solution78();
        List<List<Integer>> subsets = solution78.subsets2(nums);
        System.out.println(subsets);
    }
}


class Solution78 {
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1<<n); mask++){
            t.clear();
            for (int i = 0; i < n; i++) {
                if ((mask & (1<<i)) != 0){
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<>(t));
        }
        return ans;
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}