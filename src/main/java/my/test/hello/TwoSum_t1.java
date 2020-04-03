package my.test.hello;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_t1 {
    public static void main(String[] args) {
        int [] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    //利用hashMap的containsKey方法进行运算
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
