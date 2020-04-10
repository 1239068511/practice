package my.test.hello;

/**
 * 题目：42. 接雨水
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）
 * 示例：
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 *
 * @author HuangXiahao
 * @version V1.0
 * @class TrappingRainWater
 * @packageName my.test.hello
 * @description
 * @data 2020/4/6
 **/
public class TrappingRainWater {

    /**
     * 解题思路：双指针法
     * 本题的主要思路是通过双指针的夹进的方式判定每个格子可接雨水的量。
     * ！！通过双指针在数组的两边维系一面最高的墙，通过最高的墙体可用计算每个格子能接雨水的量！！
     * 指针通过不断的循环夹进，在循环开始时需要判断两面最高的墙中哪边较矮
     * 较矮的一遍减去当前的格子便能得到当前格子的可接水量
     * 通过将每次接水量相加得到最后的答案
     * @param height 输入数组
     * @Return : int
     * @Author : HuangXiahao
     * @Date : 2020/4/10 13:36
    */

    public static int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        while (left<=right){
            if (leftMax>rightMax){
                result += leftMax - height[left] >0?leftMax - height[left]:0;
                leftMax = Math.max(leftMax,height[left]);
                left++;
            }else {
                result += rightMax - height[right] >0?rightMax - height[right]:0;
                rightMax = Math.max(rightMax,height[right]);
                right--;
            }
        }
        return result;
    }
} 
