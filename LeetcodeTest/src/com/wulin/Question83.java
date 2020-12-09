package com.wulin;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Question83 {
    public static void main(String[] args) {

    }
}


class Solution{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if (current == null){
            return current;
        }
        while (current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }
}

class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 0){
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] > o2[1]){
                    return 1;
                }else if (o1[1] < o2[1]) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon : points){
            if (balloon[0] > pos){
                ans++;
                pos = balloon[1];
            }
        }
        return ans;
    }
}


