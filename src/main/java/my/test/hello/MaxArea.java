package my.test.hello;

import java.util.*;

public class MaxArea {
    public static void main(String[] args) {
        int[] x = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(x);
        System.out.println("容器能够容纳水的最大值为:" + i);
    }

//    通过双指针向内夹进的方式进行运算
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

//    通过循环的方式进行运算
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
