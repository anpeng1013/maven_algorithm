package me.anpeng.recursion;

/**
 * @ClassName: JianZhi_Fibonacci_10.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 22:13
 *
 * 题目：
 *      写出一个函数，输入n，求Fibonacci数列的第n项。
 */
public class JianZhi_10_Fibonacci {
    /**
     * @Title: FibonacciWithLoop
     * @Description: 与LeetCode爬楼梯类似，可以使用三种方法（递归，递归加HashMap，循环），这里直接使用循环解法。
     * @Author: anpeng
     * @DateTime: 2024/5/23 22:19
     */
    public static int FibonacciWithLoop(int n){
        if(n == 1) return 0;
        if(n == 2) return 1;
        int result = 0;
        int prePre = 0;
        int pre = 1;
        for (int i = 3; i <= n; i++) {
            result = prePre + pre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

}
