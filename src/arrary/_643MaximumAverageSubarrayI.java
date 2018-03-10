package arrary;

/**
 * Given an array consisting of n integers,
 * find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 *
 * Example 1: Input: [1,12,-5,-6,50,3], k = 4 Output: 12.75
 * Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 *
 * Note: 1 <= k <= n <= 30,000.
 * Elements of the given array will be in the range [-10,000, 10,000].
 *
 * @author Chanlk
 * Create 2/21/18
 */
public class _643MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {

        int max = 0;
        int cur = 0;
        for(int i = 0;i < k;i++){
            cur += nums[i];
        }
        max = cur;
        for(int j = 1;j < nums.length - k + 1;j++){
            cur = cur - nums[j-1] + nums[j+k-1];
            if(cur > max)
                max = cur ;
        }
        return max / (k+0.0);

    }
    public static void main(String[] argus){
        int[] nums = {0,4,0,3,2};
        _643MaximumAverageSubarrayI maximumAverageSubarrayI = new _643MaximumAverageSubarrayI();
        maximumAverageSubarrayI.findMaxAverage(nums,1);
    }
}
