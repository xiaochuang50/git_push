package com.wulin;

public class Question35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(new Solution35().searchInsert(nums,5));
    }
}

class Solution35{
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int ans = n;
        while (left <= right){
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
