class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        int k=0, count = 0;
        boolean alltrue = true;
        for(int i=0; i<strs[0].length(); i++) {
            char []c = strs[0].toCharArray(); 
            for(int j=1; j<strs.length; j++) {
                if(i >= strs[j].length()) {
                    alltrue = false;
                    break;
                }
                if(c[i] != strs[j].charAt(i)) {
                    alltrue = false;
                }
            }
            if(alltrue) count++;
        }

        return new String (strs[0].substring(0, count));


    }
}