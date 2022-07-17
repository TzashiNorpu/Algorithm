package algo.tzashinorpu.WeekContest.D220717;

import java.util.PriorityQueue;
import java.util.TreeMap;


public class smallestTrimmedNumbers_6121 {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] res = new int[queries.length];
        int len = nums[0].length();
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int trim = query[1];
            int k = query[0];
//            TreeMap<Integer, Integer> map = new TreeMap<>();
            TreeMap<String, PriorityQueue<Integer>> map = new TreeMap<>();

            for (int j = 0; j < nums.length; j++) {
                String t = nums[j].substring(len - trim);
                map.putIfAbsent(t, new PriorityQueue<>());
                map.get(t).add(j);
//                map.put(Integer.parseInt(t), j);
            }
            for (int j = 0; j < k - 1; j++) {
                if (map.firstEntry().getValue().size() == 1) {
                    map.pollFirstEntry();
                } else {
                    map.firstEntry().getValue().poll();
                }

            }
            res[i] = map.pollFirstEntry().getValue().poll();
        }
        return res;
    }
}
