package linkedList;

import me.anpeng.linkedList.LeetCode_160_Intersection;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: InterLinkedListTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/26 16:05
 */
public class InterLinkedListTest {

    @Test
    public void testWithViolenceWalk(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入链表A：");
        String[] strNodes = input.nextLine().split(" ");
        ListNode headA = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入链表B前面的未重合部分：");
        strNodes = input.nextLine().split(" ");
        ListNode headB = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入相交节点在链表A中的位置：");
        int interPos = input.nextInt();
        ListNode.buildInterLinkedList(headA, headB, interPos);
        ListNode result = LeetCode_160_Intersection.getIntersectionNodeWithViolenceWalk(headA, headB);
        System.out.println(result);
    }

    @Test
    public void testWithHashMap(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入链表A：");
        String[] strNodes = input.nextLine().split(" ");
        ListNode headA = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入链表B前面的未重合部分：");
        strNodes = input.nextLine().split(" ");
        ListNode headB = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入相交节点在链表A中的位置：");
        int interPos = input.nextInt();
        ListNode.buildInterLinkedList(headA, headB, interPos);
        ListNode result = LeetCode_160_Intersection.getIntersectionNodeWithHashMap(headA, headB);
        System.out.println(result);
    }

    @Test
    public void testWithDoublePointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入链表A：");
        String[] strNodes = input.nextLine().split(" ");
        ListNode headA = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入链表B前面的未重合部分：");
        strNodes = input.nextLine().split(" ");
        ListNode headB = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入相交节点在链表A中的位置：");
        int interPos = input.nextInt();
        ListNode.buildInterLinkedList(headA, headB, interPos);
        ListNode result = LeetCode_160_Intersection.getIntersectionNodeWithDoublePointer(headA, headB);
        System.out.println(result);
    }

    @Test
    public void testWithDiffStart(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入链表A：");
        String[] strNodes = input.nextLine().split(" ");
        ListNode headA = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入链表B前面的未重合部分：");
        strNodes = input.nextLine().split(" ");
        ListNode headB = ListNode.buildLinkedListNode(strNodes);
        System.out.println("请输入相交节点在链表A中的位置：");
        int interPos = input.nextInt();
        ListNode.buildInterLinkedList(headA, headB, interPos);
        ListNode result = LeetCode_160_Intersection.getIntersectionNodeWithDiffStart(headA, headB);
        System.out.println(result);
    }
}
