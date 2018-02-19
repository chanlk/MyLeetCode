package arrary;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 *
 *    Example 1

     Input: [3,0,1]
     Output: 2
     Example 2

     Input: [9,6,4,2,3,5,7,0,1]
     Output: 8

 * @author Chanlk
 * Create 2/19/18
 */
public class _268MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;

        for (int x : nums){
            sum += x;
        }
        int s = (1+nums.length)*nums.length/2;
        return s - sum;
    }
}
