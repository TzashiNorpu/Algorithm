package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import java.util.*;

public class LeetCode_6_773 {
    int[][] neigbors = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};

    public int slidingPuzzle(int[][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                sb.append(board[i][j]);
            }
        }
        int step = 0;
        String initialString = sb.toString();
        if (initialString.equals("123450")) {
            return step;
        }
        Queue<String> stack = new LinkedList<>();
        stack.offer(initialString);
        HashSet<String> visited = new HashSet<>();
        visited.add(initialString);
        while (!stack.isEmpty()) {
            step++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String s = stack.poll();
                for (String ns : getTransfer(s)) {
                    if (!visited.contains(ns)) {
                        if (ns.equals("123450")) {
                            return step;
                        }
                        stack.offer(ns);
                        visited.add(ns);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> getTransfer(String s) {
        List<String> swapRes = new ArrayList<>();
        int zeroIndex = s.indexOf("0");
        for (int i = 0; i < neigbors[zeroIndex].length; i++) {
            swapRes.add(swap(s, zeroIndex, neigbors[zeroIndex][i]));
        }
        return swapRes;
    }

    private String swap(String s, int zeroIndex, int swapIndex) {
        char[] chars = s.toCharArray();
        char temp = chars[zeroIndex];
        chars[zeroIndex] = chars[swapIndex];
        chars[swapIndex] = temp;
        return new String(chars);
    }
}
