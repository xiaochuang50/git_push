package com.wulin;

public class Question24 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        Solution24 solution24 = new Solution24();
        ListNode node2 = solution24.swapPairs2(node1);
        while (node2 != null){
            System.out.println(node2.val);
            node2 = node2.next;
        }
    }
}


class Solution24{
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newNode = head.next;
        head.next = swapPairs(newNode.next);
        newNode.next = head;
        return newNode;
    }

    public ListNode swapPairs2(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode tmp = preHead;
        while (tmp.next != null && tmp.next.next != null){
            ListNode node1 = tmp.next;
            ListNode node2 = tmp.next.next;
            tmp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tmp = node1;
        }
        return preHead.next;
    }
}


