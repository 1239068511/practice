package my.test.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] x = new int[]{ -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ints = threeSum(x);
        System.out.println(ints);
    }

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
