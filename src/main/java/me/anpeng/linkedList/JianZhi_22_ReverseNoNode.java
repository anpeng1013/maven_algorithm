package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: Jianzhi_22_ReverseNoNode.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/30 21:10
 */
public class JianZhi_22_ReverseNoNode {

    public static ListNode ReverseNoNodeWithFastSlowPointer(ListNode head, int k){
        ListNode fast = head, slow = head;
        for (int i = 0; i < k - 1; i++) { //让快指针先走k-1步，再让快慢指针同时走。
            fast = fast.next;
        }
        while (fast.next != null){//当快指针走到表尾节点时，慢指针刚好走到倒数第k个节点。
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
