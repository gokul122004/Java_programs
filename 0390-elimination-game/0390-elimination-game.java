class Solution {
    public int lastRemaining(int n) {
        boolean left = true;
        int first = 1;
        int diff = 1;
        int len = n;

        while(len > 1) {
            if(left || len % 2 == 1) {
                first += diff;    
            }
            
            left = !left;
            len /= 2;
            diff *= 2;
        }

        return first;
    }
}