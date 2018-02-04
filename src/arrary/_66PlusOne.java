package arrary;

import java.util.Arrays;

/**
 * Given a non-negative longeger represented as a non-empty array of digits, plus one to the longeger.
 * You may assume the longeger do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * @author Chanlk
 * Create 2/5/18
 */
public class _66PlusOne {
    public int[] plusOne(int[] digits) {

//        long sum = 0;
//        int length = 0;
//        for(int x = 0,i = digits.length-1;i >= 0;i--,x++){
//            sum += digits[x] * Math.pow(10,i);
//        }
//        sum += 1;
//        long temp = sum;
//        while (sum > 0){
//            sum /= 10;
//
//            length++;
//        }
//        int res[] = new int[length];
//        for(int j = length - 1 ;j >= 0; j-- ){
//            res[j] = (int) (temp % 10);
//            temp /= 10;
//        }
//
//        return res;

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }
    public static void main(String[] argus){
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        _66PlusOne One = new _66PlusOne();
        int[] res = One.plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
