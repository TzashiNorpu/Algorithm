package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import java.util.ArrayList;
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
                if (node.children == null) {
                    node.children[index] = new Trie();
                }
                node = node.children[index];
            }
            node.isEnd = true;
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        Trie root = new Trie();
        for (String t : words) {
            root.insert(t);
        }
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, root, 0, 0, dirs, res);
            }
        }
        return res;
    }

    private void dfs(char[][] board, Trie root, int x, int y, int[][] dirs, List<String> res) {
        
    }


}
