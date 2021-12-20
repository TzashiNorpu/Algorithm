package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode_6_212_1 {
    class Trie {
        Trie[] children;
        boolean isEnd;

        Trie() {
            this.children = new Trie[26];
            this.isEnd = false;
        }

        void insert(String s) {
            Trie node = this;
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }

        void delete(String s) {
            Trie node = this;
            backTrack(node, 0, s);
        }

        void backTrack(Trie node, int index, String s) {
            if (index == s.length()) {
                return;
            }
            backTrack(node.children[s.charAt(index) - 'a'], index + 1, s);
            if (index == s.length() - 1) {
                node.children[s.charAt(index) - 'a'].isEnd = false;
            }
            if (allChildrenNull(node.children[s.charAt(index) - 'a'])) {
                node.children[s.charAt(index) - 'a'] = null;
            }
        }

        private boolean allChildrenNull(Trie node) {
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    return false;
                }
            }
            return true;
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> set = new HashSet<>();
        Trie root = new Trie();
        for (String t : words) {
            root.insert(t);
        }
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, visited, root, root, i, j, dirs, "", set);
            }
        }
        return new ArrayList<>(set);
    }

    private void dfs(char[][] board, boolean[][] visited, Trie node, Trie root, int x, int y, int[][] dirs, String temp, HashSet<String> set) {
        if (node == null) {
            return;
        }
        if (node.isEnd) {
            set.add(temp);
            // 从前缀树删除该单词
            root.delete(temp);
//            return;
        }
        if (invalid(x, y, board)) {
            return;
        }
        if (node.children[board[x][y] - 'a'] == null) {
            return;
        }
        if (visited[x][y]) {
            return;
        }

        for (int i = 0; i < dirs.length; i++) {
            visited[x][y] = true;
            dfs(board, visited, node.children[board[x][y] - 'a'], root, x + dirs[i][0], y + dirs[i][1], dirs, temp + board[x][y], set);
            visited[x][y] = false;
        }
    }

    private boolean invalid(int x, int y, char[][] board) {
        return x < 0 || x >= board.length || y < 0 || y >= board[0].length;
    }

    public List<String> findWords2(char[][] board, String[] words) {
        HashSet<String> set = new HashSet<>();
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (String w : words) {
            boolean[][] visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    dfs2(board, visited, dirs, i, j, 0, w, set);
                }
            }
        }
        return new ArrayList<>(set);
    }

    private void dfs2(char[][] board, boolean[][] visited, int[][] dirs, int x, int y, int index, String w, HashSet<String> set) {
        if (w.length() == index) {
            set.add(w);
            return;
        }
        if (invalid(x, y, board)) {
            return;
        }

        if (board[x][y] != w.charAt(index)) {
            return;
        }
        if (visited[x][y]) {
            return;
        }

        for (int i = 0; i < dirs.length; i++) {
            visited[x][y] = true;
            dfs2(board, visited, dirs, x + dirs[i][0], y + dirs[i][1], index + 1, w, set);
            visited[x][y] = false;
        }
    }
}
