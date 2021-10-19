package algo.tzashinorpu.Week03.Chapter09;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_127 {
    // BFS
    private int ladderLength(String beginWord, String endWord, List<String> wordList) {
        LinkedList<String> stack = new LinkedList<>();
        HashSet<String> set = new HashSet<>(wordList);
        int depth = 0;
        stack.offer(beginWord);
        set.remove(beginWord);
        while (stack.size() > 0) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();

            }
        }
        return 0;
    }
}
