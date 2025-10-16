class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = word1[0];
        String w2 = word2[0];

        if(word1.length > 1) {
            for(int i=1; i<word1.length; i++) {
                w1 = w1 + word1[i];
            }
        }

        if(word2.length > 1) {
            for(int i=1; i<word2.length; i++) {
                w2 = w2 + word2[i];
            }
        }

        if(w1.equals(w2)) {
            return true;
        }

        return false;
    }
}