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
    public static void twoMergeWithAPI(int[] nums1, int m, int[] nums2, int n){
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    /**
     * @Title: twoMergeWithDoublePointer
     * @Description: 使用双指针和临时数组，对两个数组分别从0开始比较。每次将小的放入临时临时数组，并向后移动指针。
     * @Author: anpeng
     * @DateTime: 2024/5/24 17:41
     */
    public static void twoMergeWithDoublePointer(int[] nums1, int m, int[] nums2, int n){
        int k = m + n;
        int[] temp = new int[k];
        for (int tempIndex = 0, nums1Index = 0, nums2Index = 0; tempIndex < k; tempIndex++) {
            if(nums1Index >= m){//nums1数组已经取完，后续依次取nums2数组即可。
                temp[tempIndex] = nums2[nums2Index++];
            }else if(nums2Index >= n){//nums2数组已经取完，后续依次取nums1数组即可。
                temp[tempIndex] = nums1[nums1Index++];
            }else if (nums1[nums1Index] < nums2[nums2Index]) {//nums1的元素小于nums2的元素，取nums1的值。
                temp[tempIndex] = nums1[nums1Index++];
            }else {//nums1的元素大于或等于nums2的元素，取nums2的值。
                temp[tempIndex] = nums2[nums2Index++];
            }
        }

        for (int i = 0; i < k; i++) {
            nums1[i] = temp[i];
        }
    }

    /**
     * @Title: twoMergeWithDoublePointerReverse
     * @Description: 使用双指针，对两个数组分别从末尾开始比较。每次将大的放入nums1的最后，并向前移动指针。
     * @Author: anpeng
     * @DateTime: 2024/5/24 17:43
     */
    public static void twoMergeWithDoublePointerReverse(int[] nums1, int m, int[] nums2, int n){
        int k = m + n;
        for (int i = k-1, nums1Index = m-1, nums2Index = n-1; i >= 0 ; i--){
            if(nums1Index < 0){
                nums1[i] = nums2[nums2Index--];
            }else if(nums2Index < 0){
                break;
            }else if(nums1[nums1Index] > nums2[nums2Index]){
                nums1[i] = nums1[nums1Index--];
            }else{
                nums1[i] = nums2[nums2Index--];
            }
        }
    }
}

