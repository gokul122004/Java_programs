class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i=0; i<n; i++) {
            ans[i] = findMin(nums.get(i));
        }

        return ans;
    }

    private int findMin(int x) {
        if ( x%2==0 ) {
            return -1;
        }

        int pos = 0;
        int temp = x;

        while(( temp & 1 ) == 1 ) {
            pos++;
            temp >>= 1;
        }

        if (temp == 0) return x >> 1;

        int y = 1 << ( pos - 1 );
        return x ^ y;
    }
}