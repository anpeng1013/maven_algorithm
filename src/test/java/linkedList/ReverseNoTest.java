package linkedList;

import me.anpeng.linkedList.JianZhi_22_ReverseNoNode;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: ReverseNoTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/30 21:16
 */
public class ReverseNoTest {
    @Test
    public void testWithFastSlowPointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildLinkedListNode(strNode);
        System.out.println("请输入一个整数k：");
        int k = input.nextInt();
        ListNode result = JianZhi_22_ReverseNoNode.ReverseNoNodeWithFastSlowPointer(head, k);
        System.out.println("倒数第" + k + "个节点为：" + result.val);
    }

}
