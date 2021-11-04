package algo.tzashinorpu.SecondRound.Chapter09;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class minMutation_433 {
    public int minMutation(String start, String end, String[] bank) {
        HashSet<String> dic = new HashSet<>(List.of(bank));
        if (!dic.contains(end)) {
            return 0;
        }
        char[] letters = {'A', 'C', 'G', 'T'};

        LinkedList<String> stack = new LinkedList<>();
        stack.offer(start);
        dic.remove(start);
        int level = 0;
        while (stack.size() > 0) {
            int size = stack.size();
            level++;
            for (int i = 0; i < size; i++) {
                char[] chars = stack.poll().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c : letters) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(end)) {
                                return level;
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
        return 0;
    }
}
