package hashtable;

import java.util.HashSet;

public class _202HappyNumber {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        boolean res = true;
        HashSet hash = new HashSet<Integer>();
        do{
            int sum = 0;
            do{
                //int sum = 0;
                sum += (n % 10)*(n % 10);
                n /=10;
            }
            while( n != 0);
            if(hash.add(sum) == false){
                res = false;
                break;
            }
            n = sum;
        }
        while(n != 1);
        return res;
    }
    public static void main(String args[]){
        _202HappyNumber happyNumber = new _202HappyNumber();
        boolean happy = happyNumber.isHappy(3);
        System.out.println(happy);
    }

}
