package arrary;
import java.util.Arrays;
/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 *  say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * @author Chanlk
 * Create 1/15/18
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for(int x : nums){
            count ++ ;
            if(count % 2 == 1){
                sum += x;
            }
        }
        return sum;
    }
}
