package arrary;

/**
 * 最大子串
 *
 * @author Chanlk
 * Create 1/17/18
 */
public class MaximumSubarray {

    public int solution(int[] nums){
        int nowValue = nums[0];
        int maxSub = nums[0];

        for (int i = 0;i<nums.length;i++){

            if(nowValue > 0){
                nowValue += nums[i];
            }else {
                nowValue = nums[i];
            }
            if (nowValue > maxSub){
                maxSub = nowValue;
            }

        }
        return maxSub;
    }
    public static void main(String[] argus){
        int[] nums = {-1,5,-6,10,-1,3,-3,6};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int ints = maximumSubarray.solution(nums);
        System.out.println(ints);
    }
}
