package arrary;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * Example:  Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * @author Chanlk
 * Create 18/6/1
 */
public class _163SumClosest {
    public static void main(String[] argus){
        int nums[] = {1,1,-1,-1,3};
        _163SumClosest sumClosest = new _163SumClosest();
        sumClosest.threeSumClosest(nums,1);
    }
    public int threeSumClosest(int[] nums, int target) {
        //方法思路，每次固定一个指针，然后让头指针和尾指针进行滑动
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;

        for(int i = 0;i < nums.length - 2; i++){
            int start = i + 1,end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum > target){
                    end--;
                }
                else{
                    start++;
                }
                if(Math.abs(sum - target) < Math.abs(res - target)){
                    res = sum;
                }
            }
        }
        return res;

    }
}
