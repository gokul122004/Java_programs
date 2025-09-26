class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        if(points.length <= 1 && !(points[0][0] == x || points[0][1] == y)) {
            return -1;
        }

        int row = points.length;
        int count = Integer.MAX_VALUE;
        int x1 = 0;
        int y1 = 0;
        int index = -1;

        for(int i=0; i<row; i++) {
            if(points[i][0] == x || points[i][1] == y) {
                x1 = points[i][0];
                y1 = points[i][1];
            } else {
                continue;
            }
            int temp = manhattanDistance(x1, x, y1, y);
            if(temp < count) {
                count = temp;
                index = i;
            }
        }

        return index;
    }

    public static int manhattanDistance(int x1, int x, int y1, int y) {
        return Math.abs(x1 - x) + Math.abs(y1 - y);
    }
}