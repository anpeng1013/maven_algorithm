package me.anpeng.linkedList;

import me.anpeng.util.ListNode;

/**
 * @ClassName: LeetCode_MergeTwoLinkedList_21.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 17:08
 *
 * 题目：
 *      合并两个有序的单链表，返回一个有序的单链表。
 */

public class LeetCode_21_MergeTwoLinkedList {

    public static ListNode mergeTwoLinkedList(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode resultNode = new ListNode(0);//保存表头指针
        ListNode p = resultNode;//遍历比较指针。
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null)
            p.next = l1;
        if (l2 != null)
            p.next = l2;
        return resultNode.next;
    }

    public static ListNode mergeLinkedListWithRecursive(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = mergeLinkedListWithRecursive(l1.next, l2);
            return l1;
        }
        l2.next = mergeLinkedListWithRecursive(l1, l2.next);
        return l2;
    }
}
