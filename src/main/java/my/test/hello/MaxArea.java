package my.test.hello;

import java.util.*;


/**
 *
 * 题目：11.盛最多的水
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中
 * 的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 * 示例：
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 *
 * @author HuangXiahao
 * @version V1.0
 * @class MaxArea
 * @packageName my.test.hello
 * @description
 * @data 2020/4/5
 **/

public class MaxArea {

    /***
     * 解题思路：通过双指针向内夹进的方式进行运算。
     * 对坐标数组的头和尾建立指针left和right，设最大面积为maxArea。
     * 通过循环使两枚指针向内夹进，直到两枚指针重合。
     * 每一次循环时计算当前指针位置所表示的最大面积并判断是否大于maxArea，若大于则赋值给maxArea
     * 计算完毕后，将所代表数较小的一方对应的指针向中间移动一位
     * 循环结束后返回maxArea
     * @param height 坐标数组
     * @Return : int
     * @Author : HuangXiahao
     * @Date : 2020/4/5 18:58
    */
    public static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left<right){
            maxArea = Math.max((right-left)*Math.min(height[left], height[right]),maxArea);
            if (height[left] < height[right]) {
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }

    /***
     * 以下代码为另一种解题思路
     * 解题思路：通过循环的方式进行运算。
     * 设最大面积为maxArea
     * 对数组进行两次循环，每一次循环对本次循环能代表的最大面积进行计算
     * 每次计算后对本次计算结果与maxArea进行比较
     * 若本次计算结果大于maxArea则将结果赋值给maxArea
     * 嵌套循环结束后返回maxArea
     *
     * @param height 坐标数组
     * @Return : int
     * @Author : HuangXiahao
     * @Date : 2020/4/5 18:58
     */

//    public static int maxArea(int[] height) {
//        if (height.length < 2) {
//            return 0;
//        }
//        int maxArea = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                maxArea = Math.max((j-i)*Math.min(height[j],height[i]),maxArea);
//            }
//        }
//        return maxArea;
//    }

}
