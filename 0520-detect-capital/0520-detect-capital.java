class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        int n = word.length();

        for(int i=0; i<n; i++) {
            if(word.charAt(i) < 97) capitalCount++;
        }

        if (capitalCount == n) return true;
        else if (capitalCount == 0) return true;
        else if (capitalCount == 1 && word.charAt(0) < 97 ) return true;

        return false;
    }
}