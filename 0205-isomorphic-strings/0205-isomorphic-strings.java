import java.util.Arrays;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] st = new int[256];
        boolean[] used = new boolean[256];

        Arrays.fill(st, -1);

        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(st[c1] == -1 ) {
                if(used[c2]) return false;
                st[c1] = c2;
                used[c2] = true;
            } else if(st[c1] != c2 ) {
                return false;
            }
        }

        return true;
    }
}