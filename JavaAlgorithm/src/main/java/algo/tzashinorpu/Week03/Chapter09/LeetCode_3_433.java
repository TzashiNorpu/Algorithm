package algo.tzashinorpu.Week03.Chapter09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LeetCode_3_433 {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> set = new HashSet<>(Arrays.asList(bank));
        if (!set.contains(end)) {
            return -1;
        }
        char[] base = {'A', 'C', 'G', 'T'};
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(start);
        set.remove(start);
        int step = 0;
        while (stack.size() > 0) {
            step++;
            int size = stack.size();
            for (int l = 0; l < size; l++) {
                String poll = stack.poll();
                // bfs
                for (int i = 0; i < poll.length(); i++) {
                    char[] temp = poll.toCharArray();
                    char oldChar = temp[i];
                    for (char c : base) {
                        temp[i] = c;
                        String newStr = new String(temp);
                        if (set.contains(newStr)) {
                            set.remove(newStr);
                            stack.offer(newStr);
                        }
                        if (newStr.equals(end)) {
                            return step;
                        }
                    }
                    temp[i] = oldChar;
                }
            }
        }
        return -1;
    }
}
