package algo.tzashinorpu.WeekContest.D0917;

import java.util.Arrays;

public class matchPlayersAndTrainers_6185 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i = 0, j = 0;
        int p = players.length, t = trainers.length;
        int res = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while (i < p && j < t) {
            if (players[i] <= trainers[j]) {
                res++;
                i++;
                j++;
            } else
                j++;
        }
        return res;
    }
}
