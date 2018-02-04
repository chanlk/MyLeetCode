package arrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3, Return [1,3,3,1].
 * Note: Could you optimize your algorithm to use only O(k) extra space?
 *
 * @author Chanlk
 * Create 2/4/18
 */
public class _119PascalsTriangle2 {


    /**
     * 思路及说明: 首先第一层是0;既0层是[1],1层是[1,1],2层是[1,2,1]
     *            思路是用数组保存着原来的值,不断的循环利用上层的值来建立下层
     *            特别提醒:ArraryList中的add(index,element)方法,
     *            如果已经有元素了,会把原来的后移一位空出位置给新来的
     *            建议使用:set方法!
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<Integer>();
        if (rowIndex < 0) //小于0层直接返回空的List
            return list;


        for(int i = 0 ; i <= rowIndex ; i++ ){ //i是层数记录,每一次循环完成第i层的建立
            list.add(0,1);
            for (int j = 1; j < i ;j++ ){
                list.set(j,list.get(j)+list.get(j + 1));
            }
        }

        return list;
    }
    public static void main(String[] argus){
        int rowIndex = 3;
        _119PascalsTriangle2 pascalsTriangle2 = new _119PascalsTriangle2();
        List<Integer> row = pascalsTriangle2.getRow(rowIndex);
        System.out.println(row.toString());


    }
}
