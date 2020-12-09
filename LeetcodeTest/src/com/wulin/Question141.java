package com.wulin;

import java.util.HashSet;

public class Question141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        node3.next = node1;
        System.out.println(new Solution141().hasCycle(head));
    }
}

class Solution141{
    public boolean hasCycle(ListNode head){
        HashSet<ListNode> seen = new HashSet<>();
        while (head != null){
            if (!seen.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    
}