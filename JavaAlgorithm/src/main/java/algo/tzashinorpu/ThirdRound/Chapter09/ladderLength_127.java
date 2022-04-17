package algo.tzashinorpu.ThirdRound.Chapter09;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

public class ladderLength_127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> stringSet = new HashSet<>(wordList);
        if (!stringSet.contains(endWord)) {
            return 0;
        }
        int step = 1;
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offerLast(beginWord);
        while (!deque.isEmpty()) {
            int size = deque.size();
            step++;
            for (int k = 0; k < size; k++) {
                char[] chars = deque.pollFirst().toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char oldChar = chars[i];
                    for (int j = 0; j < 26; j++) {
                        chars[i] = (char) ('a' + j);
                        String newString = new String(chars);
                        if (stringSet.contains(newString)) {
                            deque.offerLast(newString);
                            stringSet.remove(newString);
                        }
                        if (newString.equals(endWord)) return step;
                    }
                    chars[i] = oldChar;
                }
            }
        }
        return 0;
    }
}
