package my.test.hello;

/**
 * 
 *
 * @author HuangXiahao
 * @version V1.0
 * @class TrappingRainWater
 * @packageName my.test.hello
 * @description
 * @data 2020/4/6
 **/
public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

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
