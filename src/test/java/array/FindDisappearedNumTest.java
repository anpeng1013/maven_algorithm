package array;

import me.anpeng.array.LeetCode_FindDisappearedNum_448;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: FindDisappearedNumTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 11:17
 */
public class FindDisappearedNumTest {

    @Test
    public void testWithNegativeIndex(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数数组：");
        String[] strNums = input.nextLine().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        List<Integer> result = LeetCode_FindDisappearedNum_448.findDisappearedNumWithIndex(nums);
        System.out.println(result);
    }

    @Test
    public void testWithMode(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数数组：");
        String[] strNums = input.nextLine().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        List<Integer> result = LeetCode_FindDisappearedNum_448.findDisappearedNumWithMode(nums);
        System.out.println(result);
    }
}
