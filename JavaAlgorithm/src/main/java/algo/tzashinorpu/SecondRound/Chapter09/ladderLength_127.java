package algo.tzashinorpu.SecondRound.Chapter09;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ladderLength_127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dic = new HashSet<>(wordList);
        int depth = 0;
        if (!dic.contains(endWord)) {
            return depth;
        }
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        depth++;
        dic.remove(beginWord);
        while (stack.size() > 0) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                char[] chars = stack.poll().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(endWord)) {
                                return depth + 1;
                            } else {
                                stack.offer(s);
                                dic.remove(s);
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            depth++;
        }
        return 0;
    }
}
