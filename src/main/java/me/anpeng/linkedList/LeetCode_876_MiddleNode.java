package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_876_MiddleNode.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/29 22:11
 *
 * 题目描述：
 *  给定一个头节点为head的非空链表，返回链表的中间节点。如果有两个中间节点（链表长度为偶数），则返回第二个中间节点。
 */
public class LeetCode_876_MiddleNode {

    public static ListNode middleNodeWithTwoWalk(ListNode head){
        int middle = 0, length = 0;
        ListNode current = head, middleNode = head;
        while(current != null){
            length += 1;
            current = current.next;
        }
        middle = length / 2 + 1; // 奇数时：5/2 + 1 = 3（第3个是中间节点）；偶数时：6/2 + 1 = 4（第四个是中间节点）
        for (int i = 1; i < middle; i++) {
            assert middleNode != null;
            middleNode = middleNode.next;
        }
        return middleNode;
    }

    public static ListNode middleNodeWithFastSlowPointer(ListNode head){
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
