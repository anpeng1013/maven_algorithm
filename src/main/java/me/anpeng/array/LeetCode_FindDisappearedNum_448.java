package me.anpeng.array;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: LeetCode_FindDisappearedNum_448.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/25 10:45
 *
 * 题目：
 *      给你一个含n个整数的数组nums，其中nums[i]在区间[1,n]内。请你找出所有在[1,n]范围内，但没有出现在nums中的数字，
 *      并以数组的形式返回结果。
 *          注意：你不能使用额外的空间且时间复杂度为O(n)。
 */
public class LeetCode_FindDisappearedNum_448 {

    /**
     * @Title: findDisappearedNumWithIndex
     * @Description: 遍历每一位数字，将该取绝对值后-1，即将该数字对应的顺序下标位置的数字赋值为对应的负数。
     *               最后统计非负数的下标位置，该下标加1就是未出现的数字。
     * @Author: anpeng
     * @DateTime: 2024/5/25 11:11
     */
    public static List<Integer> findDisappearedNumWithIndex(int[] nums){
        for (int num : nums) {
            nums[Math.abs(num) - 1] = - Math.abs(nums[Math.abs(num) - 1]);//注意，这里是设置为负数，不是简单取反。
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }

    /**
     * @Title: findDisappearedNumWithMode
     * @Description: 遍历每次数字num，将其减一再对n取模（num-1）% n 得到该数字对应的下标，再将该下标位置的数字+n(类似上面设为负数)
     * @Author: anpeng
     * @DateTime: 2024/5/25 17:53
     */
    public static List<Integer> findDisappearedNumWithMode(int[] nums){
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;//对n取模，还原出它本来的下标。
            nums[x] += n;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(nums[i] <= n)
                result.add(i+1);
        }
        return  result;
    }
}
