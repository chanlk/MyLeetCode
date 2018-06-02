package arrary;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime?
 * You may assume the returned likedlist does not count as extra space.
 *
 * @author Chanlk
 * Create 1/16/18
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        //第一种方法,将有的值取负
        List list = new LinkedList<Integer>();
        int idx = 0;
        for(int i = 0;i < nums.length;i++){
            idx = Math.abs(nums[i]) -1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }

        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;

    }
    public static void main(String[] argus){
        int[] nums = {1,1};
        FindAllNumbersDisappearedinanArray findAllNumbersDisappearedinanArray = new FindAllNumbersDisappearedinanArray();
        List<Integer> numbers = findAllNumbersDisappearedinanArray.findDisappearedNumbers(nums);
        System.out.println(666);
    }
}
