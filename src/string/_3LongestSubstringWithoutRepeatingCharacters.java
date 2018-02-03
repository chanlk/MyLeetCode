package string;

/**
 * 寻找最长不重复字符串
 *
 * @author Chanlk
 * Create 12/30/17
 */
public class _3LongestSubstringWithoutRepeatingCharacters {



    public int lengthOfLongestSubstring(String s) {
        //特殊情况处理:s为空和null都返回0;
        if (s==null&&"".equals(s)){
            return 0;
        }

        int l = 0,r = 0 ; //[l..r] is the longest substring
        //int start=0,end=0;
        StringBuffer sb = new StringBuffer();
        int maxLength = 0;


        while (r < s.length()) {

            if (sb.indexOf(String.valueOf(s.charAt(r))) == -1) { //如果不在sb中,则添加进去
                sb.append(s.charAt(r++));
                if(sb.length()>maxLength){
                    maxLength = sb.length();
                }
            }

            else {                                              //如果在,那么删掉重复的,然后再把r++加进去
                int index = sb.indexOf(String.valueOf(s.charAt(r)));
                sb.append(s.charAt(r++));
                sb.delete(0,index+1);
                l+=(index+1);
            }
        }
        return maxLength;
    }
    public static void main(String[] argus){
        String s = "abcabcbbasdasddabcqqqdef";
        _3LongestSubstringWithoutRepeatingCharacters sulution = new _3LongestSubstringWithoutRepeatingCharacters();
        int length = sulution.lengthOfLongestSubstring(s);
        System.out.println(length);


    }

}
