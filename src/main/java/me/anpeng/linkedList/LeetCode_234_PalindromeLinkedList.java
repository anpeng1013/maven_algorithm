package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_234_PalindromeLinkedList.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/27 22:10
 */
public class LeetCode_234_PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //如果链表是奇数个节点，把正中的归到左边
        if(fast != null)
            slow = slow.next;
        slow = ReverseLinkedList(slow); //反转后半部分
        fast = head;

        while (slow != null){
            if(fast.val != slow.val){
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

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
