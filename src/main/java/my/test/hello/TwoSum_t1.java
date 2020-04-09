package my.test.hello;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：1.两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 说明：你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例：
 * 输入：nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author HuangXiahao
 * @version V1.0
 * @class TwoSum_t1
 * @packageName my.test.hello
 * @description
 * @data 2020/4/5
 **/
public class TwoSum_t1 {

    /**
     * 解题思路：利用hashmap的特性完成计算
     * 对数组进行遍历，每次遍历时计算机目标数字并检查哈希表中是否存在目标数字
     * 若存在则得出最后的答案，若不存在则将遍历的数字和下标插入哈希表中
     *
     * @param nums 需要计算的数组
     * @param target 目标数字
     * @Return : int[]
     * @Author : HuangXiahao
     * @Date : 2020/4/5 20:08
    */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) ) {
                return new int[] { map.get(complement),i };
            }
            map.put(nums[i],i);
        }
        throw  new IllegalArgumentException("数据错误");
    }
}
