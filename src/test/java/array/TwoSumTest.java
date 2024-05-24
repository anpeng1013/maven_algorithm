package array;

import me.anpeng.array.LeetCode_TwoSum_1;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: TwoSumTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 22:37
 */
public class TwoSumTest {

    @Test
    public void testWithViolence(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个用空格分隔的整数数组nums：");
        String [] stringNums = input.nextLine().split(" ");
        int [] nums = new int[stringNums.length];
        for (int i = 0; i < stringNums.length; i++) {
            nums[i] = Integer.parseInt(stringNums[i]);
        }
        System.out.println("请输入目标值target：");
        int target = input.nextInt();
        int [] result = LeetCode_TwoSum_1.twoSumWithViolence(nums, target);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testWithHashMap(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个用空格分隔的整数数组nums：");
        String [] stringNums = input.nextLine().split(" ");
        int [] nums = new int[stringNums.length];
        for (int i = 0; i < stringNums.length; i++) {
            nums[i] = Integer.parseInt(stringNums[i]);
        }
        System.out.println("请输入目标值target：");
        int target = input.nextInt();
        int [] result = LeetCode_TwoSum_1.twoSumWithHashMap(nums, target);
        System.out.println(Arrays.toString(result));
    }

}
