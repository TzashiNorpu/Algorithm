package algo.tzashinorpu.Daily.COM;

import java.util.Arrays;
import java.util.Comparator;

public class findMinArrowShots_452 {
    public int findMinArrowShots(int[][] points) {
        //  1->6
        //    2->8
        //      7->12
        //        10->16
        // [10,16],[2,8],[1,6],[7,12]
        int ans = 1;
        boolean[] burst = new boolean[points.length];
        Arrays.sort(points, (o1, o2) -> {
            if (o1[1] < o2[1]) {
                return -1;
            } else if (o1[1] > o2[1]) {
                return 1;
            } else {
                return o1[0] - o2[0];
            }
        });
        /*for (int ballon = 0; ballon < burst.length; ballon++) {
            if (!burst[ballon]) {
                int r = points[ballon][1];
                for (int i = ballon; i < burst.length; i++) {
                    if (r >= points[i][0]) {
                        burst[i] = true;
                    }
                }
                ans++;
            }
        }*/
        int r = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (r < points[i][0]) {
                r = points[i][1];
                ans++;
            }
        }
        return ans;
    }
}
