package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

import java.util.HashMap;

/**
 * @ClassName: LeetCode_Intersection_160.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/26 15:06
 *
 * 题目：
 *      给两个单链表的头节点headA和headB，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回null。
 */
public class LeetCode_160_Intersection {

    /**
     * @Title: getIntersectionNodeWithViolenceWalk
     * @Description: 将headA中的每个节点，依次和headB中的每个节点进行比较，看是否是同一个节点，若是同一个则返回该节点。否则，返回null。
                    暴力解法会超出时间限制。
     * @Author: anpeng
     * @DateTime: 2024/5/26 15:19
     */
    public static ListNode getIntersectionNodeWithViolenceWalk(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        while(headA != null){
            ListNode temp = headB;
            while(temp != null){
                if (headA == temp)
                    return headA;
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }

    /**
     * @Title: getIntersectionNodeWithHashMap
     * @Description: 使用哈希表
     * @Author: anpeng
     * @DateTime: 2024/5/26 17:00
     */
    public static ListNode getIntersectionNodeWithHashMap(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        HashMap<ListNode, Integer> storeMap = new HashMap<>();
        while(headA != null){
            storeMap.put(headA, headA.val);
            headA = headA.next;
        }
        while (headB != null){
            if (storeMap.containsKey(headB))
                return headB;
            headB = headB.next;
        }
        return null;
    }

    /**
     * @Title: getIntersectionNodeWithDoublePointer
     * @Description: 使用双指针。
     * @Author: anpeng
     * @DateTime: 2024/5/26 17:35
     */
    public static ListNode getIntersectionNodeWithDoublePointer(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    /**
     * @Title: getIntersectionNodeWithDiffStart
     * @Description: 先统计两个链表的长度，求其差值diff。先让长链表先走diff步，再让短链表开始同步走。最后两个相遇相交的节点。
     * @Author: anpeng
     * @DateTime: 2024/5/26 17:35
     */
    public static ListNode getIntersectionNodeWithDiffStart(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        int l1 = 0, l2 =0, diff = 0;
        ListNode head1 = headA, head2 = headB;
        while (head1 != null){
            l1++;
            head1 = head1.next;
        }
        while (head2 != null){
            l2++;
            head2 = head2.next;
        }

        if (l1 < l2) {
            diff = l2 - l1;
            head1 = headB;
            head2 = headA;
        }
        else {
            diff = l1 - l2;
            head1 = headA;
            head2 = headB;
        }
        //头部长的先走
        for (int i = 0; i < diff; i++){
            head1 = head1.next;
        }

        while (head1 != null && head2 != null){
            if(head1 == head2)
                return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

}
