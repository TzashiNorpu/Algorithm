package algo.tzashinorpu.Week03.Chapter09;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_127 {
    // BFS
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        LinkedList<String> stack = new LinkedList<>();
        int depth = 0;
        stack.offer(beginWord);
        while (stack.size() > 0) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                for (int j = 0; j < wordList.size(); j++) {
                    String item = wordList.get(j);
                    if (poll.equals(endWord)) {
                        return depth;
                    }
                    if (isOneLetterChange(item, poll)) {
                        stack.offer(item);
                    }
                }
            }
        }
        return 0;
    }

    private boolean isOneLetterChange(String s1, String s2) {
        int cnt=0;
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        return cnt==1;
    }
}
