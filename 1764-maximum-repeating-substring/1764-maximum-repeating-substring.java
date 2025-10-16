class Solution {
    public int maxRepeating(String sequence, String word) {
        int len = word.length();
        int len1 = sequence.length();

        if(len1 - len == 0) { // returns 1 if both the length and word are same 
            if(sequence.equals(word)) return 1;
            else return 0;
        }

        boolean consecutive = true; // used to keep track of consecutive matching of word in sequence
        int best = 0;   // recorde the longest consecutive occurence

        for(int i=0; i<=len1 - len; i++) {
            int j = i;
            int count = 0;

            while(j <= len1 - len && sequence.substring(j, j + len).equals(word)) {
                count++;
                j += len;
            }

            if(count > best) {
                best = count;
            }
        }

        return best;
    }
}