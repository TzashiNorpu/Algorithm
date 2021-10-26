package algo.tzashinorpu.Week03.Chapter09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LeetCode_3_433_1 {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> dic = new HashSet<>(Arrays.asList(bank));
        char[] letters = {'A', 'C', 'G', 'T'};
        int depth = 0;
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(start);
        dic.remove(start);
        while (!stack.isEmpty()) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c : letters) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(end)) {
                                return depth;
                            } else {
                                stack.offer(s);
                                dic.remove(s);
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
        }
        return -1;
    }
}
