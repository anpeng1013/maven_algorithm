package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_HasCycle_142.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 21:31
 */
public class LeetCode_142_HasCycle {
    public static ListNode hasCycleWithFastSlowPointer(ListNode head){
        if(head == null) return null;
        ListNode fast = head, slow = head;
        boolean loopExists = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                loopExists = true;
                break;
            }
        }
        if(loopExists){
            slow = head;
            while (slow != fast){
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }

}
