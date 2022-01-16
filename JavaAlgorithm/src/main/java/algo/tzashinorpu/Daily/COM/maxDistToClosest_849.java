package algo.tzashinorpu.Daily.COM;

public class maxDistToClosest_849 {
    public int maxDistToClosest(int[] seats) {
        int distance = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                int l = i, r = i, temp = 0;
                while (l >= 0 && seats[l] != 1) {
                    l--;
                }
                while (r < seats.length && seats[r] != 1) {
                    r++;
                }
                int left = i - (l == -1 ? 0 : l);
                int right = (r == seats.length ? r - 1 : r) - i;
                if (left != 0 && right != 0) {
                    temp = Math.min(left, right);
                } else {
                    temp = Math.max(left, right);
                }
                distance = Math.max(distance, temp);
            }
        }
        return distance;
    }
}
