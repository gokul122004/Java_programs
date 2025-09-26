class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                k--;
                if(k == 0 ) break;
            }

            str.append(c);
        }

        return new String (str.toString());
    }
}