package arrary;

/**
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container,
 * such that the container contains the most water.
 *
 * Note: You may not slant the container and n is at least 2.
 *
 * @author Chanlk
 * Create 2/4/18
 */
public class _11ContainerWithMostWater {

    //思路 :指针对撞的典型!
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0 ,j = height.length - 1;


        while (i < j){
            res = Math.max(res,(j - i) * Math.min(height[i],height[j]));
            if (height[i] > height[j]){
                j--;
            }
            else
                i++;
        }
        return res;
    }

    public static void main(String[] argus){
        int height[] = {1,2,5,2,6};
        _11ContainerWithMostWater container = new _11ContainerWithMostWater();
        int i = container.maxArea(height);
        System.out.println(i);
    }
}
