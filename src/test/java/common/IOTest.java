package common;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName: IOTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/30 16:35
 */
public class IOTest {

    /**
     * @Title: test01
     * @Description: 输入两个整数a,b，输出a+b的结果。输入数据包括多组。
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test01(){
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
        }

    }

    /**
     * @Title: test02
     * @Description: 输入第一行为一个整数n，代表有n组数据，每组数据有两个整数a,b。输出a+b的结果。
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test02(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n > 0){
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a + b);
            n--;
        }
    }

    /**
     * @Title: test03
     * @Description: 输入两个整数a,b，输出a+b的结果。输入数据包括多组。输入0 0时结束
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test03(){
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a == 0 && b == 0)
                return;
            System.out.println(a + b);
        }
    }

    /**
     * @Title: test04
     * @Description: 输入：输入数据包括多组。每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
     *                     接下来n个正整数,即需要求和的每个正整数。
     *               输出：每组数据输出求和的结果
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test04(){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            if(n == 0) return;
            int sum = 0;
            while(n > 0){
                sum += in.nextInt();
                n--;
            }
            System.out.println(sum);
        }
    }

    /**
     * @Title: test06
     * @Description: 输入：输入多行数据。每行的第一个为整数的个数m(1 <= m <= 100)。接下来 m个正整数, 即需要求和的每个正整数。
     *               输出：每行数据输出求和的结果
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test06(){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int sum = 0;
            while (m > 0) {
                sum += in.nextInt();
                m--;
            }
            System.out.println(sum);
        }
    }

    /**
     * @Title: test07
     * @Description: 输入：输入的第一行包括一个正整数n(1 <= n <= 100), 表示数据组数。接下来n行, 每行一组数据。每行的第一个整数
     *                     为整数的个数m(1 <= m <= 100)。接下来 m个正整数, 即需要求和的每个正整数。
     *               输出：每行数据输出求和的结果
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test07(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        while (n > 0) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int sum = 0;
            while (m > 0) {
                sum += in.nextInt();
                m--;
            }
            System.out.println(sum);
            n--;
        }
    }

    /**
     * @Title: test08
     * @Description: 输入：输入数据有多组, 每行表示一组输入数据。 每行不定有n个整数，空格隔开。(1 <= n <= 100)。。
     *               输出：每行数据输出求和的结果
     * @Author: anpeng
     * @DateTime: 2024/5/30 16:36
     */
    @Test
    public void test08(){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String[] strNums = in.nextLine().split(" ");
            int sum = 0;
            for (int i = 0; i < strNums.length; i++){
                sum += Integer.parseInt(strNums[i]);
            }
            System.out.println(sum);
        }
    }
}
