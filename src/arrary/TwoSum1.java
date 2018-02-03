package arrary;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 找到数组中和等于目标的两个值的索引
 *
 * @author Chanlk
 * Create 12/30/17
 */
public class TwoSum1 {
    public static int[] solution(int[] nums, int target){
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0;i<nums.length;i++){
            map.put(nums[i],i+1);
          int x = target - nums[i];

      if(map.containsKey(x)&&map.get(x)!=i+1){
              Integer j = map.get(x);
              result[1] = i+1;
              result[0] = j;
          }
        }
        return result;
    }
    public static void main(String[] argus){
        int[] nums = {4,2,7,3,100};
        int target = 103;
        int[] solution = TwoSum1.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }
}
