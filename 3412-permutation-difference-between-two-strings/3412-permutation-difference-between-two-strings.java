class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<t.length(); j++) {
                if(c == t.charAt(j)) {
                    sum += diff(i, j);
                }
            }
        }

        return sum;
    }

    public static int diff(int a, int b) {
        int diff = Math.abs(a - b);
        return diff;
    }
}