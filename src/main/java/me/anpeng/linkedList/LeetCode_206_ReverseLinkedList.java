package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_ReverseLinkedList_206.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/26 17:31
 */
public class LeetCode_206_ReverseLinkedList {

    public static ListNode ReverseLinkedList(ListNode head){
        ListNode curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
