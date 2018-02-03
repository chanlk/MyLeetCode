package arrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 3sum
 *
 * @author Chanlk
 * Create 2/2/18
 */
public class The3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        for(int i = 0;i < nums.length-2;i++){
            if (nums[i] > 0) break;
            if(i >= 1 && nums[i] == nums[i-1]) continue;
            for(int j = i+1,h = nums.length-1;j < h ;){
                if(nums[j] + nums[h] == -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[h--]));
                    while (j < h && nums[j] == nums[j-1])
                        j++;
                    while (j < h && nums[h] == nums[h+1])
                        h--;
                }
                else if(nums[j] + nums[h] + nums[i] > 0){
                    h--;
                }
                else{
                    j++;
                }
            }
        }

        return res;

    }
    public static void main(String[] argus){
        int[] nums = {3,0,-2,-1,1,2};
        The3Sum the3Sum = new The3Sum();
        List<List<Integer>> lists = the3Sum.threeSum(nums);
        System.out.println("ad");
    }
}
