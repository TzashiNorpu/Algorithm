package algo.tzashinorpu.SpecialSubject.Array_List.PreDiff;

public class corpFlightBookings_1109 {
    public int[] corpFlightBookings_1(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            for (int i = start; i <= end; i++) {
                ans[i] += booking[2];
            }
        }
        return ans;
    }

    public int[] corpFlightBookings_2(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            ans[booking[0] - 1] += booking[2];
            if (booking[1] < n) ans[booking[1]] -= booking[2];
        }
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i - 1];
        }
        return ans;
    }

    public int[] corpFlightBookings_3(int[][] bookings, int n) {
        int[] ans = new int[n];
        for (int[] booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;
            int val = booking[2];
            ans[start] += val;
            if (end + 1 < n) ans[end + 1] += -val;
        }
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i - 1];
        }
        return ans;
    }
}
