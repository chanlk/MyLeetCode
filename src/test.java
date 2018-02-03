import org.junit.Test;

/**
 * 递归测试
 *
 * @author Chanlk
 * Create 1/15/18
 */
public class test {
    int i = 100,j=100;
    @Test
    public  int  tt(int i,int j){
        System.out.println(i + j);
        return 1+tt(i--,j)+tt(i,j--);
    }



}
