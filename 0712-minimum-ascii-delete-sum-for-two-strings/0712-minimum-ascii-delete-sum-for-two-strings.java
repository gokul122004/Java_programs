class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] arr = new int[m+1][n+1];

        for(int i=1; i<=m; i++) {
            arr[i][0] = arr[i-1][0] + s1.charAt(i-1);
        }

        for(int j=1; j<=n; j++) {
            arr[0][j] = arr[0][j-1] + s2.charAt(j-1);
        }

        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    arr[i][j] = arr[i-1][j-1];
                } else {
                    arr[i][j] = Math.min(arr[i-1][j] + s1.charAt(i-1), arr[i][j-1] + s2.charAt(j-1));
                }
            }
        }
        return arr[m][n];
    }
    
}