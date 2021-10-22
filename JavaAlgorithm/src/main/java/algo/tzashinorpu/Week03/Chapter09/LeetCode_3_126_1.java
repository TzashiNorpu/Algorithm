package algo.tzashinorpu.Week03.Chapter09;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_126_1 {
    private List<List<String>> res = new LinkedList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dic = new HashSet<>(wordList);
        HashSet<Character> letters = new HashSet<>();
        for (String s : wordList) {
            for (char c : s.toCharArray()) {
                letters.add(c);
            }
        }
        if (!dic.contains(endWord)) {
            return res;
        }
        LinkedList<String> path = new LinkedList<>();
        path.offer(beginWord);

        LinkedList<String> stack = new LinkedList<>();
        stack.add(beginWord);
        dic.remove(beginWord);
//        dfs(beginWord, endWord, dic, path, letters);
        bfsOfDfs(endWord, stack, dic, path, letters);
        return res;
    }

    private void bfsOfDfs(String endWord, LinkedList<String> stack, HashSet<String> dic, LinkedList<String> path, HashSet<Character> letters) {
        while (stack.size() > 0) {
            int size = stack.size();
            for (int j = 0; j < size; j++) {
                char[] chars = stack.poll().toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    char oldChar = chars[i];
                    for (char c : letters) {
                        chars[i] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(endWord)) {
                                LinkedList<String> clone = new LinkedList<>();
                                clone.addAll(path);
                                clone.add(s);
                                res.add(clone);
                                return;
                            } else {
                                stack.offer(s);
                                dic.remove(s);
                                path.offer(s);
                                bfsOfDfs(endWord, stack, dic, path, letters);
                                stack.remove(s);
                                dic.add(s);
                                path.remove(s);
                            }
                        }
                    }
                    chars[i] = oldChar;
                }
            }
        }
    }

    private void dfs(String beginWord, String endWord, HashSet<String> dic, LinkedList<String> path, HashSet<Character> letters) {
        char[] chars = beginWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char oldChar = chars[i];
//            for (char c = 'a'; c <= 'z'; c++) {
            for (char c : letters) {
                chars[i] = c;
                String temp = new String(chars);
                if (dic.contains(temp)) {
                    if (temp.equals(endWord)) {
                        path.offerLast(temp);
                        LinkedList<String> clone = new LinkedList<>();
                        clone.addAll(path);
                        // 最短路径筛选 begin
                        if (res.size() > 0) {
                            if (clone.size() < res.get(0).size()) {
                                res.removeAll(res);
                                res.add(clone);
                            } else if (clone.size() == res.get(0).size()) {
                                res.add(clone);
                            }
                        } else {
                            res.add(clone);
                        }
                        // 最短路径筛选 end
                        path.pollLast();
                        return;
                    } else {
                        path.offerLast(temp);
                        dic.remove(temp);
                        dfs(temp, endWord, dic, path, letters);
                        dic.add(temp);
                        path.pollLast();
                    }
                }
            }
            chars[i] = oldChar;
        }
    }
}
