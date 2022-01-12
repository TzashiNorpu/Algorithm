package algo.tzashinorpu.Daily.CN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class isEscapePossible_1036 {
    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        int n = blocked.length;
        int limit = n * (n - 1) / 2;
        HashSet<String> blocks = new HashSet<>();
        for (int[] block : blocked) {
            blocks.add(block[0] + ":" + block[1]);
        }
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        return match(source, target[0] + ":" + target[1], limit, blocks, dir) &&
                match(target, source[0] + ":" + source[1], limit, blocks, dir);
    }

    private boolean match(int[] source, String end, int limit, HashSet<String> blocks, int[][] dir) {
        int count = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add(source[0] + ":" + source[1]);
        LinkedList<String> stack = new LinkedList<>();
        // offer tail
        stack.offer(source[0] + ":" + source[1]);
        while (!stack.isEmpty()) {
            if (count > limit) {
                return true;
            }
            String[] index = stack.pollLast().split(":");
            for (int i = 0; i < dir.length; i++) {
                int x = Integer.parseInt(index[0]) + dir[i][0];
                int y = Integer.parseInt(index[1]) + dir[i][1];
                String s = x + ":" + y;
                if (visited.contains(s) || blocks.contains(s) || invalid(x, y)) {
                    continue;
                }
                if (s.equals(end)) {
                    return true;
                }
                stack.add(s);
                visited.add(s);
                count++;
            }
        }
        return false;
    }

    private boolean invalid(int x, int y) {
        return x < 0 || y < 0 || x > 999999 || y > 999999;
    }
}
