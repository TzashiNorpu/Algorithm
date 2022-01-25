package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class secondMinimum_2045 {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            HashSet<Integer> set1 = map.getOrDefault(edge[0], new HashSet<>());
            for (int j = 0; j < 2; j++) {
                set1.add(edge[1]);
            }
            map.put(edge[0], set1);

            HashSet<Integer> set2 = map.getOrDefault(edge[1], new HashSet<>());
            for (int j = 0; j < 2; j++) {
                set2.add(edge[0]);
            }
            map.put(edge[1], set2);
        }
        int res = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.offer(1);
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Integer key = stack.pollFirst();
                if (key == n) {
                    min = Math.min(res, min);
                    if (res > min) {
                        return res;
                    }
                }
                HashSet<Integer> indexes = map.get(key);
                if (indexes != null) {
                    stack.addAll(indexes);
                    count++;
                    if (count == 2) {
                        map.remove(key);
                    }
                }
            }
            // 奇数
            if ((res / change) % 2 != 0) {
                res = (res / change + 1) * change;
            }
            res += time;
        }
        return -1;
    }
}
