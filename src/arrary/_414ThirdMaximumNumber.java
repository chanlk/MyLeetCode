package arrary;

/**
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * Example 1: Input: [3, 2, 1]  Output: 1  Explanation: The third maximum is 1.
 * Example 2: Input: [1, 2]  Output: 2
 *          Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3: Input: [2, 2, 3, 1]  Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 * @author Chanlk
 * Create 2/19/18
 */
public class _414ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long first = nums[0];
        long second = Long.MIN_VALUE, third = Long.MIN_VALUE;

        boolean flag = false;
        for(int x : nums){
            if(x > first){
                third = second;
                second = first;
                first = x;
            }
            if(x < first && x > second){
                third = second;
                second = x;
            }
            if(x < second && x > third){
                flag = true;
                third = x;
            }
        }
        if(flag == true || third != Long.MIN_VALUE)
            return  (int)third;
        return (int) first;
    }
    public static void main(String[] argus){
        int[] nums = {1,2};
        _414ThirdMaximumNumber thirdMaximumNumber = new _414ThirdMaximumNumber();
        thirdMaximumNumber.thirdMax(nums);
    }
}
