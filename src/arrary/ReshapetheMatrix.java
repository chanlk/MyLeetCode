package arrary;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 重建矩阵
 *
 * @author Chanlk
 * Create 1/15/18
 */
public class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int cloumn = 0; //列数
        int row; //行数
        int r0 = 0,c0 = 0;
        for (int[] x : nums ){
            cloumn = x.length;
            break;
        }
        row = nums.length;

        if(r * c != cloumn * row)
            return nums;
        int[][] reshape = new int[r][c];
        int temp;
        for(int i=0;i<row;i++){
            for(int j = 0;j<cloumn;j++){

                temp = nums[i][j];
                if(r0 < r && c0 < c ){
                    reshape[r0][c0++] = temp;
                }else if(c0 == c){
                    reshape[++r0][0] = temp;
                    c0 = 1;
                }

            }
        }
        return reshape;
    }
    public static void main(String[] argus){
        int[][] nums = {{1,2},{4,5}};
        ReshapetheMatrix reshapetheMatrix = new ReshapetheMatrix();
        int[][] reshape = reshapetheMatrix.matrixReshape(nums, 4, 1);
        System.out.println(Arrays.toString(reshape));

    }

}
