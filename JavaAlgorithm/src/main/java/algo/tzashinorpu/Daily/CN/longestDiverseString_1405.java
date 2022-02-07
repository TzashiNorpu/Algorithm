package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;
import java.util.PriorityQueue;

public class longestDiverseString_1405 {
    public String longestDiverseStringHeap(int a, int b, int c) {
        StringBuffer sb = new StringBuffer();
        PriorityQueue<int[]> q = new PriorityQueue<int[]>((x, y) -> y[1] - x[1]);
        if (a > 0) q.add(new int[]{0, a});
        if (b > 0) q.add(new int[]{1, b});
        if (c > 0) q.add(new int[]{2, c});
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int length = sb.length();
            if (length >= 2 && sb.charAt(length - 1) - 'a' == curr[0] && sb.charAt(length - 2) - 'a' == curr[0]) {
                if (q.isEmpty()) break;
                int[] next = q.poll();
                sb.append((char) (next[0] + 'a'));
                if (--next[1] != 0) {
                    q.add(next);
                }
                q.add(curr);
            } else {
                sb.append((char) (curr[0] + 'a'));
                if (--curr[1] != 0) {
                    q.add(curr);
                }
            }
        }
        return sb.toString();
    }

    public String longestDiverseStringArray(int a, int b, int c) {
        int[][] arr = new int[][]{{'a', a}, {'b', b}, {'c', c}};
        StringBuilder sb = new StringBuilder();
        while (true) {
            int length = sb.length();
            Arrays.sort(arr, (x, y) -> y[1] - x[1]);
            if (arr[0][1] == 0) {
                break;
            }
            if (length >= 2 && sb.charAt(length - 1) == arr[0][0] && sb.charAt(length - 2) == arr[0][0]) {
                if (arr[1][1] == 0) {
                    break;
                }
                sb.append((char) arr[1][0]);
                arr[1][1]--;
            } else {
                sb.append((char) arr[0][0]);
                arr[0][1]--;
            }
        }
        return sb.toString();
    }
}
