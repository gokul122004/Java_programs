class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int i = 0;

        while(i < intervals.length) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            while (i < intervals.length - 1 && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i+1][1]);
                i++;
            }

            merged.add(new int[]{start, end});
            i++;
        }

        return merged.toArray(new int[merged.size()][0]);
    }
}