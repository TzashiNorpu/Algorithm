package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

public class ladderLength_127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.offer(beginWord);
        HashSet<String> set = new HashSet<>(wordList);
        set.remove(beginWord);
        if (!set.contains(endWord)) return 0;
        int step = 1;
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int k = 0; k < size; k++) {
                char[] chars = stack.pollFirst().toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char b = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String t = new String(chars);
                        if (set.contains(t)) {
                            set.remove(t);
                            stack.offerLast(t);
                            if (t.equals(endWord)) return step + 1;
                        }
                    }
                    chars[i] = b;
                }
            }
            step++;
        }
        return 0;
    }
}
