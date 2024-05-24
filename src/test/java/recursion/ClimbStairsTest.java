package recursion;

import me.anpeng.recursion.LeetCode_ClimbStairs_70;
import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @ClassName: ClimbStairsTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 20:47
 */
public class ClimbStairsTest {
    @Test
    public void testWithRecursion(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        int m = LeetCode_ClimbStairs_70.climbStairsWithRecursive(n);
        System.out.println("一共有"+ m + "种方法");
    }

    HashMap<Integer, Integer> storeMap = new HashMap<Integer, Integer>();
    @Test
    public void testWithRecursionAndHashMap(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入楼梯的阶数：");
        int n = input.nextInt();
        int m = LeetCode_ClimbStairs_70.climbStairsWithRecursiveAndHashMap(n);
        System.out.println("一共有" + m + "种方法");
    }

    @Test
    public void testWithLoop(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入楼梯的阶数：");
        int n = input.nextInt();
        int m = LeetCode_ClimbStairs_70.climbStairsWithLoop(n);
        System.out.println("一共有" + m + "种方法");

    }

}
