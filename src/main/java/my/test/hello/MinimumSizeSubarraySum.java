package my.test.hello;

import sun.util.resources.cldr.rof.CurrencyNames_rof;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 题目：209.长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的
 * 长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 *
 * @author HuangXiahao
 * @version V1.0
 * @class MinimumSizeSubarraySum
 * @packageName my.test.hello
 * @description
 * @data 2020/4/5
 **/
public class MinimumSizeSubarraySum {

    /**
     * 解题思路：双重循环法
     * 通过对数组进行嵌套循环计算出每一次大于等于目标数的数组，并记录下该次的数组长度
     * 所有循环执行完后输出最小数组长度
     * 优化：
     * 先通过一次循环计算出一个sums数组记录了，同下标下nums数组的该下标前的相加数
     * 在循环时通过 sums[j] - sums[i] + nums[i]  计算出相加数 该算法可以减少循环中计算相加数的时间
     *
     * @param s
     * @param nums
     * @Return : int
     * @Author : HuangXiahao
     * @Date : 2020/4/6 18:55
    */

    public static int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        if (length==0){
            return 0;
        }
        int maxsize = nums.length+1;
        int[] sums = new int[length];
        sums[0] = nums[0];
        for (int i = 1; i < length; i++) {
            sums[i] = sums[i-1]+nums[i];
        }
        for (int i = 0; i <length ; i++) {
            for (int j = i; j < length ; j++) {
                int sum = sums[j] - sums[i] + nums[i];
                if (sum>=s){
                    maxsize = Math.min(maxsize,(j-i+1));
                    break;
                }
            }
        }
        return maxsize!=length+1?maxsize:0;
    }
}
