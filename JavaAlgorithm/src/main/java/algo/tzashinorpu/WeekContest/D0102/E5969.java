package algo.tzashinorpu.WeekContest.D0102;

import java.util.Arrays;

public class E5969 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        for (int i = 0; i < asteroids.length; i++) {
            if (mass >= asteroids[i]) {
                mass += asteroids[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
