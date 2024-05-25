package linkedList;

import me.anpeng.linkedList.LeetCode_DeleteDuplicates_83;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: DeleteDuplicatesTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 19:58
 */
public class DeleteDuplicatesTest {

    @Test
    public void testWithWalk(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个有序链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildListNode(strNode);
        ListNode result = LeetCode_DeleteDuplicates_83.deleteDuplicatesWithWalk(head);
        ListNode.printLinkedListNode(result);
    }

    @Test
    public void testWithRecursive(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个有序链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildListNode(strNode);
        ListNode result = LeetCode_DeleteDuplicates_83.deleteDuplicatesWithRecursive(head);
        ListNode.printLinkedListNode(result);
    }

}
