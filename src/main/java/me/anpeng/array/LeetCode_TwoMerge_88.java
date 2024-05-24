package me.anpeng.array;

import java.util.Arrays;

/**
 * @ClassName: LeetCode_TwoMerge_88.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/24 15:36
 *
 * 题目：
 *      1、给你两个按非递减顺序排列的整数数组nums1和nums2，另外有两个整数m和n，分别表示nums1和nums2中元素的数目。
 *      2、请你合并nums2到nums1中，使合并后的数组同样按照非递减顺序排列。
 *          注意：最终，合并后的数组不应由函数返回，而是存储在数组nums1中。为了应对这种情况，nums1的初始长度应该为m+n，其中前m个元素表示
 *      应合并的元素，后n个元素为0，应忽略。nums2的长度为n。
 */
public class LeetCode_TwoMerge_88 {

    /**
     * @Title: TwoMergeWithAPI
     * @Description: 先将nums2直接添加到nums1的后n位中，然后使用Arrays工具的sort方法进行排序。
     * @Author: anpeng
     * @DateTime: 2024/5/24 16:12
     */
    public static void TwoMergeWithAPI(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

