package algo.tzashinorpu.WeekContest.D220723;

import java.util.Arrays;
import java.util.HashMap;

public class bestHand_6128 {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        if (suits[suits.length - 1] == 'a') return "Flush";
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : ranks) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }
        if (max >= 3) return "Three of a Kind";
        if (max == 2) return "Pair";
        return "High Card";
    }
}
