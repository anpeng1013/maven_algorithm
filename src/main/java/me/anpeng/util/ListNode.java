package me.anpeng.util;

/**
 * @ClassName: ListNode.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 17:11
 *
 * 链表节点类
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode buildListNode(String[] strNum){
        int n = strNum.length;
        int[] vals = new int[n];
        for(int i = 0; i < n; i++){
            vals[i] = Integer.parseInt(strNum[i]);
        }

        ListNode resultNode = new ListNode(vals[0]);
        ListNode p = resultNode;
        for(int i = 1; i < n; i++){
            ListNode tempNode = new ListNode(vals[i]);
            p.next = tempNode;
            p = p.next;
        }
        return resultNode;
    }

    public static void printLinkedListNode(ListNode head){
        ListNode current = head;
        while(current != null){
            if (current.next !=null)
                System.out.print(current.val + "->");
            else
                System.out.println(current.val);
            current = current.next;
        }
        System.out.println();
    }
}
