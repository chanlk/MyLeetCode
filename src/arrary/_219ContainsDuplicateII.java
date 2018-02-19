package arrary;

import java.util.HashMap;

/**
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 *
 * @author Chanlk
 * Create 2/17/18
 */
public class _219ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap map = new HashMap<Integer,Integer>();
        int i = 0;

        while(i < nums.length ){
            if(map.containsKey(nums[i])){
                int j = 0;
                j = (Integer)map.get(nums[i]);
                if(i - j <= k) return true;
            }
            map.put(nums[i],i++);
        }
        return false;
    }
    public static void main(String[] argus){
        int[] nums = {1,2,1};
        _219ContainsDuplicateII duplicateII = new _219ContainsDuplicateII();
        boolean b = duplicateII.containsNearbyDuplicate(nums, 1);
        System.out.println(b);
    }


}
