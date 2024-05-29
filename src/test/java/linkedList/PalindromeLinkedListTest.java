package linkedList;

import me.anpeng.linkedList.LeetCode_234_PalindromeLinkedList;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: PalindromeLinkedListTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/28 15:49
 */
public class PalindromeLinkedListTest {

    @Test
    public void testWithFastSlowPointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个单链表：");
        String[] strNode = input.nextLine().split(" ");
        ListNode head = ListNode.buildLinkedListNode(strNode);
        boolean idPalindrome = LeetCode_234_PalindromeLinkedList.isPalindrome(head);
        System.out.println(idPalindrome);
    }


}
