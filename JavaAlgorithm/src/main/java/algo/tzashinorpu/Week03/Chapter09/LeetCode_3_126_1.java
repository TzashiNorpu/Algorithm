package algo.tzashinorpu.Week03.Chapter09;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_126_1 {
    private List<List<String>> res = new LinkedList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<Character> letters = new HashSet<>();
        wordList.forEach(word -> {
            for (char c : word.toCharArray()) {
                letters.add(c);
            }
        });
        System.out.println(letters);
        HashSet<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return res;
        }
        int targetDepth = bfs(beginWord, endWord, dic, letters);
        if (targetDepth == 0) {
            return res;
        }
        HashSet<String> dic2 = new HashSet<>(wordList);
        LinkedList<String> container = new LinkedList<>();
        container.offer(beginWord);
        dic2.remove(beginWord);
        dfs(beginWord, endWord, container, dic2, letters, 0, targetDepth);
        return res;
    }

    private void dfs(String beginWord, String endWord, LinkedList<String> container, HashSet<String> dic, HashSet<Character> letters, int level, int targetDepth) {
        if (level == targetDepth) {
            return;
        }
        char[] chars = beginWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char oldChar = chars[i];
            for (char c : letters) {
                chars[i] = c;
                String s = new String(chars);
                if (dic.contains(s)) {
                    if (s.equals(endWord)) {
                        container.offer(s);
                        dic.remove(s);
                        LinkedList<String> clone = (LinkedList<String>) container.clone();
                        res.add(clone);
                    } else {
                        container.offer(s);
                        dic.remove(s);
                        dfs(s, endWord, container, dic, letters, level + 1, targetDepth);
                        dic.add(s);
                        container.pollLast();
                    }
                }
            }
            chars[i] = oldChar;
        }
    }

    private int bfs(String beginWord, String endWord, HashSet<String> dic, HashSet<Character> letters) {
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        dic.remove(beginWord);
        int level = 0;
        while (stack.size() > 0) {
            level++;
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
                            if (s.equals(endWord)) {
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
