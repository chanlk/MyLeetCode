package arrary;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 找到数组中和等于目标的两个值的索引
 *
 * @author Chanlk
 * Create 12/30/17
 */
public class _1TwoSum {

    /**
     * 思路 : 把数组元素放入hashmap中,利用hashmap的特点,可以快速找到target-当前值是否有在hashmap中
     *
     * @param nums
     * @param target
     * @return int[]
     */
    public static int[] solution(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];

            if (map.containsKey(x)) {
                Integer j = map.get(x);
                result[1] = i + 1;
                result[0] = j + 1;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] argus) {
        int[] nums = {4, 2, 7, 3, 100};
        int target = 102;
        int[] solution = _1TwoSum.solution(nums, target);
        System.out.println(Arrays.toString(solution));
    }
}
