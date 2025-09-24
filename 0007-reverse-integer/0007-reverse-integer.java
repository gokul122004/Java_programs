class Solution {
    public int reverse(int x) {
        long a = 0;
        int temp = x;
        while(temp!=0) {
            int d = temp%10;
            a = a * 10 + d;
            temp = temp/10;
            if(a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) a;
    }
}