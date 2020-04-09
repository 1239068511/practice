package my.test.hello;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：167.两数之和
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 * 示例：
 * 输入：nums = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * @author HuangXiahao
 * @version V1.0
 * @class TwoSum_t1
 * @packageName my.test.hello
 * @description
 * @data 2020/4/5
 **/

public class TwoSum_t167 {

    /**
     * 解题思路：利用双指针算法进行计算
     * 对数组的头和尾建立指针，分别为l和r
     * 通过循环使两枚指针向中间夹进，直至两枚相遇
     * 每次循环时对两枚指针所代表的数字进行相加
     * 当计算的值与目标数字相同时返回结果
     * 若不相等时判断相加值是否大于目标值
     * 若大于则右边指针向作移动否则左边指针向右移动
     *
     * @param nums 需要计算的数组
     * @param target 目标数字
     * @Return : int[]
     * @Author : HuangXiahao
     * @Date : 2020/4/5 20:20
     */

    public static int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            int sum = nums[l] + nums[r];
            if (sum==target){
                return new int[] { l,r };
            }else if (sum<target){
                l++;
            }else {
                r --;
            }
        }
        throw  new IllegalArgumentException("数据错误");
    }


    /**
     * 解题思路：利用hashmap的特性完成计算
     * 对数组进行遍历，每次遍历时计算机目标数字并检查哈希表中是否存在目标数字
     * 若存在则得出最后的答案，若不存在则将遍历的数字和下标插入哈希表中
     *
     * @param nums 需要计算的数组
     * @param target 目标数字
     * @Return : int[]
     * @Author : HuangXiahao
     * @Date : 2020/4/5 20:20
     */

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) ) {
//                return new int[] { map.get(complement),i };
//            }
//            map.put(nums[i],i);
//        }
//        throw  new IllegalArgumentException("数据错误");
//    }




}
