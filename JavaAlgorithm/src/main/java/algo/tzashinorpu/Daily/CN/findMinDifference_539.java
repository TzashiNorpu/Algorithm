package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findMinDifference_539 {
    public int findMinDifference(List<String> timePoints) {
        // 0 4 59 1337(23:57)
        int size = timePoints.size();
        if (size > 1440) {
            return 0;
        }
        Collections.sort(timePoints);
        int min = 1440 - (convert(timePoints.get(size - 1)) - convert(timePoints.get(0)));
        for (int i = 1; i < size; i++) {
            min = Math.min(convert(timePoints.get(i)) - convert(timePoints.get(i - 1)), min);
        }
        return min;
    }

    private int convert(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));
    }
}
