package arrary;

import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @author Chanlk
 * Create 1/18/18
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List res = new LinkedList<List<Integer>>();

        List yhTriangle1 = new LinkedList<Integer>();
        if (numRows == 0) return res;
        yhTriangle1.add(1);
        res.add(yhTriangle1);
        if(numRows == 1) return res;

        List yhTriangle2 = new LinkedList<Integer>();
        yhTriangle2.add(1); yhTriangle2.add(1);
        res.add(yhTriangle2);
        if(numRows == 2) return res;

        List yhTrBefor = new LinkedList<Integer>();
        yhTrBefor.addAll(yhTriangle2);
        List yhTrAfter = new LinkedList<Integer>();

        for(int i = 3;i <= numRows;i++){

            yhTrAfter.add(1);
            for(int j = 1;j <= i-2;j++){

                yhTrAfter.add((Integer) yhTrBefor.get(j-1)+(Integer)yhTrBefor.get(j));
            }
            yhTrAfter.add(1);

            List temp = new LinkedList<Integer>();
            temp.addAll(yhTrAfter);

            res.add(temp);
            yhTrBefor.clear();
            yhTrBefor.addAll(yhTrAfter);
            yhTrAfter.clear();

        }

        return res;
    }
    public static void main(String[] argus){
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        pascalsTriangle.generate(5);
    }
}
