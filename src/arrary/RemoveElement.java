package arrary;

import java.util.Arrays;

/**
 * 删除数组中给定的值
 *
 * @author Chanlk
 * Create 12/21/17
 */

public class RemoveElement {

    //思路:题目要求不能使用而额外的空间;使用双指针可以,一个快指针,一个慢指针;
    //快指针用来标记不等于给定值的,慢指针用来接收当前的值;
    public int solution(int[] nums,int value){
        int slowPointer=0;//慢指针
        for(int fastPointer=0;fastPointer<nums.length;fastPointer++){
            if(nums[fastPointer]!=value){
                nums[slowPointer]=nums[fastPointer];
                slowPointer++;
            }
        }
        return slowPointer;
    }
    public static void main(String[] argus){
        int[] nums={3,2,2,3};
        RemoveElement element = new RemoveElement();
        int length = element.solution(nums, 3);
        int[] newArrarys = Arrays.copyOfRange(nums, 0, length);
        System.out.println(Arrays.toString(newArrarys));
    }

}
