package algo.tzashinorpu.FirstRound.Chapter09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_127_1 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int depth = 1;
        HashSet<String> dic = new HashSet<>(wordList);
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        dic.remove(beginWord);
        while (!stack.isEmpty()) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                char[] chars = stack.poll().toCharArray();
                int length = chars.length;
                for (int j = 0; j < length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(endWord)) {
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
        return 0;
    }
}
