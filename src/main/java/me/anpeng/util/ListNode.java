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

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    /**
     * @Title: buildListNode
     * @Description: 构建无环单链表
     * @Author: anpeng
     * @DateTime: 2024/5/26 15:25
     */
    public static ListNode buildLinkedListNode(String[] strNum){
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

    /**
     * @Title: printLinkedListNode
     * @Description: 打印无环单链表
     * @Author: anpeng
     * @DateTime: 2024/5/26 15:24
     */
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


    /**
     * @Title: buildHasCycle
     * @Description: 构建有环链表
     * @Author: anpeng
     * @DateTime: 2024/5/26 15:24
     */
    public static ListNode buildHasCycle(String[] strNum, int pos){
        int n = strNum.length;
        int[] vals = new int[n];
        for(int i = 0; i < n; i++){
            vals[i] = Integer.parseInt(strNum[i]);
        }

        ListNode resultNode = new ListNode(vals[0]);
        ListNode p = resultNode;
        ListNode duplicate = null;
        for(int i = 1; i < n; i++){
            ListNode tempNode = new ListNode(vals[i]);
            p.next = tempNode;
            p = p.next;
            if(i == pos)
                duplicate = tempNode;
        }
        p.next = duplicate;
        return resultNode;
    }

    public static void buildInterLinkedList(ListNode headA, ListNode headB, int interPosA){
        ListNode preInter = headB;
        while (preInter.next != null){
            preInter = preInter.next;
        }
        int i = 0;
        ListNode interNode = headA;
        while (interNode.next != null){
            if(interPosA == i)
                preInter.next = interNode;
            i++;
            interNode = interNode.next;
        }
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
