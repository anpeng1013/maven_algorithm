package recursion;

import me.anpeng.recursion.JianZhi_Fibonacci_10;
import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: FibonacciTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 22:22
 */
public class FibonacciTest {
    @Test
    public void testWithLoop(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = input.nextInt();
        int m = JianZhi_Fibonacci_10.FibonacciWithLoop(n);
        System.out.println("Fibonacci数列的第" + n + "项为：" + m);
    }

}
