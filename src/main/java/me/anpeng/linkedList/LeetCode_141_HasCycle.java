package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

import java.util.HashMap;

/**
 * @ClassName: LeetCode_HasCycle_141.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 20:19
 *
 * 题目：
 *      1、给定一个链表，判断链表中是否有环。
 *      2、如果给定的链表中有某个节点，可以通过连续跟踪next指针再次到达，则链表中存在环。为了表示给定链表中的环。我们使用整数pos来表示
 *          链表尾部连接到链表中的位置（索引从0开始）。如果pos是-1，则在该链表中不存在环。注意：pos不作为参数进行传递，仅仅为了表示。
 *      3、如果链表中存在环，则返回true。否则返回false。
 */
public class LeetCode_141_HasCycle {

    /**
     * @Title: hasCycleWithHashMap
     * @Description: 使用哈希表，在遍历每个节点时判断该节点是否在哈希表，存在则有环，不存在则将当前节点加入到哈希表中。
     * @Author: anpeng
     * @DateTime: 2024/5/25 20:56
     */
    public static boolean hasCycleWithHashMap(ListNode head){
        if(head == null) return false;
        HashMap<ListNode, Integer> temp = new HashMap<>();
        int i = 0;
        while(head.next != null){
            if(temp.containsKey(head)){
                return true;
            }else{
                temp.put(head,i);
                head = head.next;
                i++;
            }
        }
        return false;
    }

    /**
     * @Title: hasCycleWithFastSlowPointer
     * @Description: 使用快慢指针，如果链表存在环，则快指针一定套圈追上慢指针。
     * @Author: anpeng
     * @DateTime: 2024/5/25 21:00
     */
    public static boolean hasCycleWithFastSlowPointer(ListNode head){
        if(head == null) return false;
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }

}
