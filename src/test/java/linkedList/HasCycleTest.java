package linkedList;

import me.anpeng.linkedList.LeetCode_141_HasCycle;
import me.anpeng.linkedList.LeetCode_142_HasCycle;
import me.anpeng.util.ListNode;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: HasCycleTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 20:39
 */
public class HasCycleTest {
    @Test
    public void testWithHashMap(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个链表：");
        String[] strNode = input.nextLine().split(" ");
        System.out.println("请输入pos值：");
        int pos = Integer.parseInt(input.nextLine());
        ListNode head = ListNode.buildHasCycle(strNode, pos);
        System.out.println(LeetCode_141_HasCycle.hasCycleWithHashMap(head));;
    }

    @Test
    public void testWithFastSlowPointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个链表：");
        String[] strNode = input.nextLine().split(" ");
        System.out.println("请输入pos值：");
        int pos = Integer.parseInt(input.nextLine());
        ListNode head = ListNode.buildHasCycle(strNode, pos);
        System.out.println(LeetCode_141_HasCycle.hasCycleWithFastSlowPointer(head));;
    }

    @Test
    public void testEntryNode(){//142、测试入环节点
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个链表：");
        String[] strNode = input.nextLine().split(" ");
        System.out.println("请输入pos值：");
        int pos = Integer.parseInt(input.nextLine());
        ListNode head = ListNode.buildHasCycle(strNode, pos);
        System.out.println(LeetCode_142_HasCycle.hasCycleWithFastSlowPointer(head).val);;
    }
}
