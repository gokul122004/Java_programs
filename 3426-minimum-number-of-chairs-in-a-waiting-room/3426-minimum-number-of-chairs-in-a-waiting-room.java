class Solution {
    public int minimumChairs(String s) {
        int available_chair = 0;
        int max_chair = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'E') {
                available_chair++;
            } else if(s.charAt(i) == 'L') {
                available_chair--;
            }

            if(available_chair > max_chair) {
                max_chair = available_chair;
            }
        }

        return max_chair;
    }
}