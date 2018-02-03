package arrary;

import java.util.Arrays;

/**
 * 在有序数组中找到两个等于目标值的元素
 *
 * @author Chanlk
 * Create 12/30/17
 */
public class TwoSum2 {

    public static int[] solution(int[] nums ,int target){
        int i = 0,j = nums.length-1;
        int[] result = new int[2];

        while (nums[i] + nums[j] != target){
            while (nums[i] + nums[j] > target){
                j--;
            }
            while (nums[i] + nums[j] < target){
                i++;
            }
        }
        result[0] = i+1;
        result[1] = j+1;

        return result;
    }

    public static void main(String[] argus){

        int[] nums = {2,3,5,6,100};
        int target = 106;
        int[] solution = TwoSum2.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }
}
