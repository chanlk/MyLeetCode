package recursion;

/**
 * 阶乘递归算法
 *
 * @author Chanlk
 * Create 18/6/2
 */
public class Factorial {
    public static int factorial(int i){
        if (i == 1) return 1;
        return i * factorial(--i);
    }
    public static void main(String[] argus){
        int factorial = Factorial.factorial(5);
        System.out.println(factorial);
    }

}
