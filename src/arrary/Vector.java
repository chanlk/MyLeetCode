package arrary;

/**
 * 动态数组
 *
 * @author Chanlk
 * Create 12/22/17
 */
public class Vector {

    static Integer x=6;
    static int x1=8;
    public void change(Integer x){
        x=8;
    }
    public void change1(int x){
        x1=6;
    }
    public static void main(String[] argus){

//        Integer[] test={1,2};
//        Integer a=test[1];
//        test[1]=3;
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(test[1]));


//        int[] test1 = {1,2};
//        int[] a = test1;
//        a[1] = 5;
//        System.out.println(test1[1]==5);
        String s1="hello";
        String s2=s1;
        s1="java";
        System.out.println(s2);

        Integer[] test2 = {1,2};
        Integer[] b=test2;
        b[1]=5;
        System.out.println(test2[1]==5);


//        Integer[] test3 = {1,2};
//       Integer[] c=test3;
//       test3[1]=5;
//       System.out.println(c[1]==5);
//       Vector vector = new Vector();
//       vector.change(x);
//        vector.change1(x1);
//        System.out.println(x1);
    }
}
