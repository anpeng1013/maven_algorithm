package array;

import me.anpeng.array.LeetCode_MoveZero_283;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: MoveZeroTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/24 21:35
 */
public class MoveZeroTest {

    @Test
    public void testWithDoublePointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入包含0的整数数组：");
        String[] strNums = input.nextLine().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        LeetCode_MoveZero_283.moveZeroWithDoublePointer(nums);
        System.out.println(Arrays.toString(nums));
    }

}
