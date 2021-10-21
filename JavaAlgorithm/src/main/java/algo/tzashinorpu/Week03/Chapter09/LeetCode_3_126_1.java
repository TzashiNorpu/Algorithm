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
        path.offerLast(beginWord);
        dfs(beginWord, endWord, dic, path, letters);
        return res;
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


    /*private void bfsOfRecursive(HashSet<String> st, HashSet<String> ed, HashSet<String> dic, LinkedList<String> stPath, LinkedList<String> edPath) {
        if (st.size() == 0 || ed.size() == 0) {
            res = new LinkedList<>();
        }
        if (st.size() > ed.size()) {
            bfsOfRecursive(st, ed, dic, stPath, edPath);
        }
        HashSet<String> next = new HashSet<>();
        for (String s : st) {
            stPath.offerLast(s);
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char oldChar = chars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String temp = new String(chars);
                    if (dic.contains(temp)) {
                        if (ed.contains(temp)) {
                        } else {
                            next.add(temp);
                        }
                    }
                }
                chars[i] = oldChar;
            }
            stPath.pollLast();
        }
        bfsOfRecursive(st, ed, dic, stPath, edPath);
    }*/
}
