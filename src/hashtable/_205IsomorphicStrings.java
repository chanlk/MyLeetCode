package hashtable;

public class _205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        char s_char;
        char t_char;
        for(int i=0;i<s.length();i++){
            s_char = s.charAt(i);
            t_char = t.charAt(i);
            if(m1[s_char]!=m2[t_char]){
                return false;
            }
            m1[s_char] = i+1;
            m2[t_char] = i+1;
        }
        return true;
    }
    public static void main(String args[]){
        String a = "paper" ,b = "title";
        _205IsomorphicStrings isomorphicStrings = new _205IsomorphicStrings();
        boolean isomorphic = isomorphicStrings.isIsomorphic(a, b);

    }
}
