class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;

        int a = 2;
        for(int i=2; i<n; i++) {
            if(nums[i] != nums[a-2]) {
                nums[a] = nums[i];
                a++;
            }
        }

        return a;
    }
}