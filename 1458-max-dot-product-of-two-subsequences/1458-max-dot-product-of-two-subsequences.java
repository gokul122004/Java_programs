class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] prev = new int[n + 1];
        Arrays.fill(prev, Integer.MIN_VALUE / 2);
        prev[0] = Integer.MIN_VALUE / 2;

        for(int i=1; i<=m; i++) {
            int[] curr = new int[n + 1];
            Arrays.fill(curr, Integer.MIN_VALUE / 2);
            curr[0] = Integer.MIN_VALUE / 2;

            for (int j=1; j<=n; j++) {
                int pro = nums1[i - 1] * nums2[j - 1];

                int useBoth = prev[j - 1] + pro;

                int skip1 = prev[j];
                int skip2 = curr[j - 1];
                int startNew = pro;

                curr[j] = Math.max(Math.max(useBoth, skip1), Math.max(skip2, startNew));
            }

            prev = curr;
        }

        return prev[n];
    }
}