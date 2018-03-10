package zz;

/**
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。 你能帮帮小Q吗？
 *
 * @author Chanlk
 * Create 2/22/18
 */
public class PutA_ZToTail {
    public String solution(String s){
        //StringBuffer sb = s;
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for(int i = 0;i < sb.length() - count;i++){
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                char temp  = sb.charAt(i);
                for (int j = i; j < sb.length() - 1;j++) {
                    sb.setCharAt(j, sb.charAt(j+1));
                }
                sb.setCharAt(sb.length() - 1, temp);
                i--;
                count++;
            }

        }
        String s1 = sb.toString();
        return s1;
    }
    public static void main(String[] args) {
        String s = "ABcde";
        PutA_ZToTail putA_zToTail = new PutA_ZToTail();
        putA_zToTail.solution(s);
    }

}
