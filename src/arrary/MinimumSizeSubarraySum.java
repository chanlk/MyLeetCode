package arrary;

/**
 * 找到数组中大于等于目标的最短子数组的长度
 *
 * @author Chanlk
 * Create 12/30/17
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int i=0,j=0,sum=0;
        int min = Integer.MAX_VALUE;

        while(j<nums.length){

            while(sum < s && j < nums.length){
                sum+=nums[j++];
            }

            while(sum >= s && i <= j){
                if(min > j-i) min = j - i;
                sum -= nums[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;

    }
    public static void main(String[] argus){
        int[] nums = {1,1}; int target = 3;
        MinimumSizeSubarraySum sum = new MinimumSizeSubarraySum();
        int len = sum.minSubArrayLen(3, nums);
        System.out.println(len);
    }
}
