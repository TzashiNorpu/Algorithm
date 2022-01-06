package algo.tzashinorpu.Daily.COM;


public class carPooling_1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        // trips = [[2,1,6],[1,2,4],[1,5,9],[4,8,10],[2,9,12]], capacity = 4
        // trips = [[2,1,5],[1,6,7],[1,5,7],[4,8,10],[2,9,12]], capacity = 4
        int[][] count = new int[1001][2];
        int max = 0;
        for (int i = 0; i < trips.length; i++) {
            count[trips[i][1]][0] += trips[i][0];
            count[trips[i][2]][1] += trips[i][0];
            max = Math.max(max, trips[i][2]);
        }
        for (int i = 0; i <= max; i++) {
            count[i][0] = (i - 1 < 0 ? 0 : count[i - 1][0]) + count[i][0];
            count[i][1] = (i - 1 < 0 ? 0 : count[i - 1][1]) + count[i][1];
            int people = count[i][0] - count[i][1];
            if (people > capacity) {
                return false;
            }
        }
        return true;
    }
}
