package me.anpeng.array;

/**
 * @ClassName: LeetCode_MoveZero_283.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/24 17:46
 *
 * 题目：
 *      给定一个数组nums，编写一个函数将所有0移动到数组的末尾，同时保持非零元素的相对顺序。
 *          注意：必须在原数组上进行操作，不能拷贝额外的数组。
 */
public class LeetCode_MoveZero_283 {

    public static void moveZeroWithDoublePointer(int nums[]){
        if (nums == null){
            return;
        }
        //第一次遍历的时候，j指针记录非0元素的个数，只要非零的统统都赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        //第二次遍历的时候，非零元素统计完了，剩下的都是0了。把末尾的元素都赋为0即可。
        for (int i = j; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
