package zz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 小Q今天在上厕所时想到了这个问题：有n个数，两两组成二元组，差最小的有多少对呢？差最大呢？
 *
 * @author Chanlk
 * Create 2/22/18
 */
public class Problem_3 {

    public static void main(String[] argus){

        Problem_3 problem_3 = new Problem_3();

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] solution = problem_3.solution(1, a);
            for(int i = 0;i< solution.length;i++){
                if(i != solution.length - 1){
                    System.out.print(solution[i] + " ");
                }
                else  System.out.println(solution[i]);
            }
        }


    }
    public int[] solution(int N,int[] nums){
        Arrays.sort(nums);
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;int max = 0;
        int countZero = 1,curMin = 1,countMin = 0, countMax = 0;
        int right = 1,left = 1;
        for(int i = 0 ,j = 1;j < nums.length;i++,j++){

            if (nums[j] - nums[i] == min && nums[j] - nums[i] != 0){
                countMin++;
            }
            if (nums[j] - nums[i] < min || nums[j] - nums[i] == 0){

                if (nums[j] - nums[i] != 0){
                    min = nums[j] - nums[i];
                    countMin = 1;
                }
                if(nums[j] - nums[i] == 0){
                    if (min != 0) {
                        countMin = 0;
                        min = nums[j] - nums[i];

                    }

                        countZero = 2;
                        curMin = 1;
                        while (j < nums.length - 1 && nums[j + 1] == nums[j]) {
                            countZero++;
                            curMin = countZero * (countZero - 1) / 2;
                            i++;
                            j++;
                        }
                        countMin += curMin;

                }
            }
        }
        res[0] = countMin;
        for(int i = 0, j = nums.length - 1;i < j;i = j){
            if (nums[j] - nums[i] != 0){
                while (nums[j-1] == nums[j]){
                    j--;
                    right ++;
                }
                while (nums[i+1] ==nums[i]){
                    i++;
                    left++;
                }
                countMax = right * left;
            }
            else
                countMax = nums.length * (nums.length - 1) / 2;
        }
        res[1] = countMax;
        return res;

    }


}
