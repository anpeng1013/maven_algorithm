package array;

import me.anpeng.array.LeetCode_88_TwoMerge;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName: TwoMergeTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/24 16:13
 */
public class TwoMergeTest {

    @Test
    @SuppressWarnings("all")
    public void testWithAPI(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数组：");
        String[] strNums1 = input.nextLine().split(" ");
        System.out.println("请输入第一个数组长度：");
        int m = Integer.parseInt(input.nextLine());

        System.out.println("请输入第二数组：");
        String[] strNums2 = input.nextLine().split(" ");
        System.out.println("请输入第二个数组长度：");
        int n = Integer.parseInt(input.nextLine());

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = Integer.parseInt(strNums1[i]);
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(strNums2[i]);
        }

        LeetCode_88_TwoMerge.twoMergeWithAPI(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    @SuppressWarnings("all")
    public void testWithDoublePointer(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数组：");
        String[] strNums1 = input.nextLine().split(" ");
        System.out.println("请输入第一个数组长度：");
        int m = Integer.parseInt(input.nextLine());

        System.out.println("请输入第二数组：");
        String[] strNums2 = input.nextLine().split(" ");
        System.out.println("请输入第二个数组长度：");
        int n = Integer.parseInt(input.nextLine());

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = Integer.parseInt(strNums1[i]);
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(strNums2[i]);
        }

        LeetCode_88_TwoMerge.twoMergeWithDoublePointer(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    @SuppressWarnings("all")
    public void testWithDoublePointerReverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数组：");
        String[] strNums1 = input.nextLine().split(" ");
        System.out.println("请输入第一个数组长度：");
        int m = Integer.parseInt(input.nextLine());

        System.out.println("请输入第二数组：");
        String[] strNums2 = input.nextLine().split(" ");
        System.out.println("请输入第二个数组长度：");
        int n = Integer.parseInt(input.nextLine());

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = Integer.parseInt(strNums1[i]);
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(strNums2[i]);
        }

        LeetCode_88_TwoMerge.twoMergeWithDoublePointerReverse(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
