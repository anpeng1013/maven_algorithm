package me.anpeng.array;

import java.util.HashMap;

/**
 * @ClassName: LeetCode_TwoNumSum_1.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/23 22:29
 *
 * 题目：
 *      给定一个数组nums和一个目标数值target，请你在改数组中找出和为目标值target的那两个整数，并返回它们的数组下标。
 */
public class LeetCode_TwoSum_1 {
    /**
     * @Title: twoSumWithViolence
     * @Description: 使用两层for循环，暴力遍历求解
     * @Author: anpeng
     * @DateTime: 2024/5/23 22:55
     */
    public static int[] twoSumWithViolence(int[] nums, int target){
        int[] result = new int[2];
        for(int i=0; i < nums.length; i++){
            for(int j= i +1 ; j < nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * @Title: twoSumWithHashMap
     * @Description: 使用HashMap存储当前遍历值的差值，每遍历一个就查询HashMap是否有对应的差值。
     * @Author: anpeng
     * @DateTime: 2024/5/23 23:00
     */
    public static int[] twoSumWithHashMap(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> storeNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer anotherIndex = storeNums.get(another);
            if(null != anotherIndex){
                result[0] = anotherIndex;
                result[1] = i;
                break;
            }else {
                storeNums.put(nums[i], i);
            }
        }
        return result;
    }

}
