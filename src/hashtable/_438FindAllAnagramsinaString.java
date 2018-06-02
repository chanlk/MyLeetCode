package hashtable;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 *
 * Example 1:  Input: s: "cbaebabacd" p: "abc"  Output: [ 0, 6]
 * Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:  Input: s: "abab" p: "ab"  Output: [0, 1, 2]
 * Explanation: The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 * @author Chanlk
 * Create 5/6/18
 */

public class _438FindAllAnagramsinaString {


    int all[] = new int[26];
    int temp[] = new int[26];
    public static void main(String[] argus){
       String s = "cbaebabacd", p = "abc";
        _438FindAllAnagramsinaString findAllAnagramsinaString = new _438FindAllAnagramsinaString();
        List<Integer> anagrams = findAllAnagramsinaString.findAnagrams(s, p);
        Integer integer[] = (Integer[]) anagrams.toArray();
        System.out.println(integer.toString());
    }

    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length())
            return null;
        ArrayList res = new ArrayList();
        boolean flag = false;
        int i = 0;
        while (i < p.length() ){
            int xx = p.charAt(i++) - 'a';
            temp[xx]++;
            all[xx]++;
        }
        i = 0;
        int begain = 0;

        while(s.length() - begain > p.length()){
            flag = compare(all,s,p.length(),begain);
            if(flag == true) {
                res.add(begain);
                flag = false;
            }
            begain ++;
            for (int j = 0;j < 26;j++){
                all[j] = temp[j];
            }
        }
        return res;
    }

    public boolean compare(int all[],String s,int length,int begain){
        int q = begain;
        while(begain - q < length){
            if(--all[s.charAt(begain++) - 'a'] < 0)
                return false;}
        return true;
    }
}
