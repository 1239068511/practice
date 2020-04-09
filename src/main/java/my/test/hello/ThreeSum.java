package my.test.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/**
 * 题目：15.三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 示例：
 * 输入：nums = [-1, 0, 1, 2, -1, -4]
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 *
 * @author HuangXiahao
 * @version V1.0
 * @class TwoSum_t1
 * @packageName my.test.hello
 * @description
 * @data 2020/4/5
 **/
public class ThreeSum {

    /**
     * 解题思路：三指针算法
     * 因为本题目不需要考虑数组下标，且不能出现重复的三元组
     * 所以第一步对数组进行排序
     * 排序后对数组进行进行一次遍历，每次遍历的index作为第一个指针
     * 其余两个指针l和r 分别是 index+1 , 和 length-1
     * 之后用循环使 l 和 r 两枚指针向中间移动，若 l 和 r所代表的数相加为目标数字
     * 则向结果数组中添加一个结果
     * 判断完毕后两边指针向内移动一位，指针移动后若移动后的数字跟移动前的数字相同则再次移动一位
     *
     *
     * @param nums 需要计算的数组
     * @Return : java.util.List<java.util.List<java.lang.Integer>>
     * @Author : HuangXiahao
     * @Date : 2020/4/5 21:12
     */

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        ArrayList<List<Integer>> arrayList = new ArrayList();
        for (int i = 0; i <nums.length ; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            int targe = -nums[i];
            while (l<r){
                if (nums[l]+nums[r]==targe){
                    arrayList.add(Arrays.asList(nums[l],nums[r],nums[i])) ;
                    r--;
                    l++;
                    while (l<nums.length&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while (l<r&&nums[r]==nums[r+1]){
                        r--;
                    }
                }else if (nums[l]+nums[r]<targe){
                    l++;
                }else {
                    r --;
                }
            }
        }
        return arrayList;
    }
}
