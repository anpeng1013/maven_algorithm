package me.anpeng.recursion;

import java.util.HashMap;

/**
 * @ClassName: Fibonacci_70.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 20:24
 *
 * 题目：
 *      假设你在爬楼梯。需要n阶才能到达楼顶。
 *      每次你可以爬1个或2个台阶，你有多少种不同的方法可以爬到楼顶？
 *
 */
public class LeetCode_ClimbStairs_70 {

    /**
     * @Title: climbStairsWithRecursive
     * @Description: 递归的解法--n方的时间复杂度，在某些用例下会超时
     * @Author: anpeng
     * @DateTime: 2024/5/23 20:41
     * @Param int
     * @Return int
     * @Throws null
     */
    public static int climbStairsWithRecursive(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairsWithRecursive(n-1) + climbStairsWithRecursive(n-2);
    }


    public static HashMap<Integer, Integer> storeMap = new HashMap<>();
    /**
     * @Title: climbStairsWithRecursiveAndHashMap
     * @Description: 使用带HashMap的递归解法，测试通过
     * @Author: anpeng
     * @DateTime: 2024/5/23 21:26
     * @Param int
     * @Return int
     * @Throws void
     */
    public static int climbStairsWithRecursiveAndHashMap(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(null != storeMap.get(n))
            return storeMap.get(n);
        else {
            int result = climbStairsWithRecursiveAndHashMap(n-1) + climbStairsWithRecursiveAndHashMap(n-2);
            storeMap.put(n, result);
            return result;
        }
    }

    /**
     * @Title: climbStairsWithLoop
     * @Description: 使用循环的解法，自底向上逐步累加
     * @Author: anpeng
     * @DateTime: 2024/5/23 22:04
     * @Param null
     * @Return
     * @Throws
     */
    public static int climbStairsWithLoop(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        int result = 0;
        int pre = 2;
        int prePre = 1;
        for(int i = 3; i <= n; i++){
            result = pre + prePre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

}
