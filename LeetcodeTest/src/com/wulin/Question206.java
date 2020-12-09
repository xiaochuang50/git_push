package com.wulin;

import java.util.List;

public class Question206 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        Solution206 solution206 = new Solution206();
        ListNode reverseListNode = solution206.reverseList(listNode);
        while (reverseListNode != null){
            System.out.println(reverseListNode.val);
            reverseListNode = reverseListNode.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution206{
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode tempNode = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tempNode;
        }
        return pre;
    }
}