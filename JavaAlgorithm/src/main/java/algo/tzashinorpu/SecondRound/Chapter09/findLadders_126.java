package algo.tzashinorpu.SecondRound.Chapter09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class findLadders_126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dic = new HashSet<>(wordList);
        List<List<String>> res = new LinkedList<>();
        if (!dic.contains(endWord)) {
            return res;
        }

        HashMap<String, LinkedList<String>> changePath = new HashMap<>();
        HashMap<String, Integer> stringLevel = new HashMap<>();
        LinkedList<String> stack = new LinkedList<>();
        int level = 0;
        stack.offer(beginWord);
        stringLevel.put(beginWord, level);
        dic.remove(beginWord);
        boolean found = false;
        while (stack.size() > 0) {
            int size = stack.size();
            level++;
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (stringLevel.containsKey(s) && level == stringLevel.get(s)) {
                            changePath.get(s).push(poll);
                        }
                        if (dic.contains(s)) {
                            stringLevel.put(s, level);
                            changePath.putIfAbsent(s, new LinkedList<>());
                            changePath.get(s).push(poll);
                            stack.offer(s);
                            dic.remove(s);
                            if (s.equals(endWord)) {
                                found = true;
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            LinkedList<String> temp = new LinkedList<>();
            temp.offerFirst(endWord);
            dfs(beginWord, endWord, temp, changePath, res);
        }
        return res;
    }

    private void dfs(String beginWord, String endWord, LinkedList<String> temp, HashMap<String, LinkedList<String>> changePath, List<List<String>> res) {
        if (beginWord.equals(endWord)) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (String s : changePath.get(endWord)) {
            temp.offerFirst(s);
            dfs(beginWord, s, temp, changePath, res);
            temp.pollFirst();
        }
    }
}
