package linkedList;

import me.anpeng.linkedList.LeetCode_206_ReverseLinkedList;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: ReverseLinkedListTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/26 17:48
 */
public class ReverseLinkedListTest {

    @Test
    public void testReverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单链表：");
        String[] strNodes = input.nextLine().split(" ");
        ListNode head = ListNode.buildLinkedListNode(strNodes);
        ListNode result = LeetCode_206_ReverseLinkedList.ReverseLinkedList(head);
        ListNode.printLinkedListNode(result);
    }

}
