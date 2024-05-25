package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_DeleteDuplicates_83.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 19:50
 *
 * 题目：
 *      给定一个已经排序的链表，删除重复的元素，保证每个元素只出现一次
 */
public class LeetCode_DeleteDuplicates_83 {

    /**
     * @Title: deleteDuplicates
     * @Description: 通过遍历已排序的链表，判断当前节点和下个节点的值是否相等，来判断是否跳过下一个节点。
     * @Author: anpeng
     * @DateTime: 2024/5/25 19:56
     */
    public static ListNode deleteDuplicatesWithWalk(ListNode head){
        if(head == null)
            return head;
        ListNode currentNode = head;
        while(null != currentNode.next){
            if(currentNode.val == currentNode.next.val)
                currentNode.next = currentNode.next.next;
            else
                currentNode = currentNode.next;
        }
        return head;
    }

    /**
     * @Title: deleteDuplicatesWithRecursive
     * @Description: 递归处理，在本质上就是将链表压栈后倒序处理了。
     * @Author: anpeng
     * @DateTime: 2024/5/25 20:14
     */
    public static ListNode deleteDuplicatesWithRecursive(ListNode head){
        if(head == null || head.next == null) return head;
        head.next = deleteDuplicatesWithRecursive(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
