package linkedList;

import me.anpeng.linkedList.LeetCode_876_MiddleNode;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: MiddleNodeTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/29 22:21
 */
public class MiddleNodeTest {

    @Test
    public void testWithTwoWalk(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildLinkedListNode(strNode);
        ListNode middle = LeetCode_876_MiddleNode.middleNodeWithTwoWalk(head);
        System.out.println(middle.val);
    }

    @Test
    public void testWithFastSlowPointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildLinkedListNode(strNode);
        ListNode middle = LeetCode_876_MiddleNode.middleNodeWithFastSlowPointer(head);
        System.out.println(middle.val);
    }

}
