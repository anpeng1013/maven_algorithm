package linkedList;

import me.anpeng.linkedList.LeetCode_MergeTwoLinkedList_21;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: MergeTwoLinkedListTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 17:27
 */
public class MergeTwoLinkedListTest {

    @Test
    public void testWithDoublePointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个有序单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode l1 = ListNode.buildListNode(strNode);
        System.out.println("请输入第二个有序单链表：");
        strNode = input.nextLine().split(" ");
        ListNode l2 = ListNode.buildListNode(strNode);
        ListNode result = LeetCode_MergeTwoLinkedList_21.mergeTwoLinkedList(l1,l2);
        ListNode.printLinkedListNode(result);
    }

    @Test
    public void testWithRecursive(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个有序单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode l1 = ListNode.buildListNode(strNode);
        System.out.println("请输入第二个有序单链表：");
        strNode = input.nextLine().split(" ");
        ListNode l2 = ListNode.buildListNode(strNode);
        ListNode result = LeetCode_MergeTwoLinkedList_21.mergeLinkedListWithRecursive(l1,l2);
        ListNode.printLinkedListNode(result);
    }
}
