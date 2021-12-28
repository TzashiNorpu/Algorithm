package algo.tzashinorpu.Daily.CN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LeetCode_427 {
    private List<String> res1 = new ArrayList<>();

    // pure dfs
    public List<String> findAllConcatenatedWordsInADict1(String[] words) {
        int length = words.length;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            minLen = Math.min(minLen, words[i].length());
        }
        for (int i = 0; i < length; i++) {
            if (words[i].length() >= minLen * 2) {
                dfs(0, "", words[i], words);
            }
        }
        return res1;
    }

    public void clearRes1() {
        this.res1.clear();
    }

    public void clearRes2() {
        this.res2.clear();
    }

    private void dfs(int level, String temp, String dest, String[] words) {
        if (level > words.length) {
            return;
        }
        if (!dest.startsWith(temp)) {
            return;
        }
        if (temp.length() > dest.length()) {
            return;
        }
        if (temp.equals(dest) && level >= 2) {
            this.res1.add(temp);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (dest.substring(temp.length()).startsWith(words[i])) {
                dfs(level + 1, temp + words[i], dest, words);
            }
        }
    }

    // dfs with trie
    private class Trie {
        boolean isEnd;
        Trie[] children;

        public Trie() {
            this.children = new Trie[26];
        }
    }

    private void insert(String s) {
        Trie node = this.root;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    Trie root;
    private List<String> res2 = new ArrayList<>();

    public List<String> findAllConcatenatedWordsInADict2(String[] words) {
        this.root = new Trie();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (String s : words) {
            // 空串不跳过会直接加到结果集里
            if (s.length() == 0) continue;
            if (dfsWithTrie(s, 0)) {
                this.res2.add(s);
            } else {
                insert(s);
            }
        }
        return res2;
    }

    private boolean dfsWithTrie(String s, int level) {
        if (level == s.length()) {
            return true;
        }
        Trie node = this.root;
        while (level < s.length()) {
            int index = s.charAt(level) - 'a';
            if (node.children[index] == null) {
                return false;
            } // node 下探一层
            node = node.children[index];
            // 下探后可以判断该单词是否时完整的一个单词
            // 当前满足一个word则进入下一层,node更新为根节点
            if (node.isEnd && dfsWithTrie(s, level + 1)) {
                return true;
            }

            // 当前在字典树上但不是一个完整的word时当前层循环
            level++;
        }
        return false;
    }

    // dp
    public List<String> findAllConcatenatedWordsInADict3(String[] words) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> res = new ArrayList<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            set.add(words[i]);
        }
        for (String s : words) {
            if (check(s, set)) {
                res.add(s);
            }
        }
        return res;
    }

    private boolean check(String s, HashSet<String> set) {
        int length = s.length();
        int[] ints = new int[length + 1];
        Arrays.fill(ints, -1);
        ints[0] = 0;
        for (int i = 0; i < length; i++) {
            if (ints[i] == -1) {
                continue;
            }
            for (int j = i + 1; j <= length; j++) {
                String temp = s.substring(i, j);
                if (set.contains(temp)) {
                    ints[j] = Math.max(ints[i] + 1, ints[j]);
                }
            }
            if (ints[length] > 1) return true;
        }
        return false;
    }
}
