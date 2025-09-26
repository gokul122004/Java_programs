class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = 0;
        int currSum = 0;

        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                currSum += nums[i];
            } else if(nums[i] <= nums[i-1])  {
                currSum = nums[i];
            } else {
                currSum += nums[i];
            }

            if(currSum > sum) {
                sum = currSum;
            }
        }

        return sum;
    }
}