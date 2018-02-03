package arrary;



import java.util.LinkedList;
import java.util.List;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 *
 * @author Chanlk
 * Create 1/17/18
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        //自己的暴力算法
//        int max = 0;
//        int nowNum;
//        for(int i = 0;i < prices.length-1;i++){
//            nowNum = prices[i];
//            int leftMax = prices[i+1];
//            for(int j = i+1;j<prices.length;j++){
//                //leftMax = prices[j];
//                if(prices[j] > leftMax) {
//                    leftMax = prices[j];
//                }
//            }
//            if(leftMax - nowNum > max)
//                max = leftMax - nowNum;
//        }
//        return max;
          //双指针法
//        int res = 0; int maxEndingHere = 0;
//        for(int i = 1;i<prices.length;i++){
//            maxEndingHere = prices[i] - prices[i-1];
//            if(maxEndingHere <= 0) maxEndingHere = 0;
//            res =  (maxEndingHere > res ? maxEndingHere :  res);
//        }
//        return res;
        //把它变成最大子串题!
         int maxEndingHere = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxEndingHere += prices[i] - prices[i - 1];
            maxEndingHere = Math.max(maxEndingHere, 0);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        List list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);

        list.get(0);

        return maxSoFar;
    }


    public static void main(String[] argus){
        int[] prices = {7, 1, 5, 3, 6, 4};
        BestTimetoBuyandSellStock sellStock = new BestTimetoBuyandSellStock();
        int maxProfit = sellStock.maxProfit(prices);
        System.out.println(maxProfit);
    }
}
