package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import java.util.*;

public class LeetCode_6_212 {
    // https://leetcode-cn.com/problems/word-search-ii/
    // 四联通:上下左右
    private int[] dx = {0, 0, 1, -1};
    private int[] dy = {1, -1, 0, 0};

    // 返回TrieNode
    private Trie buildTrie(String[] words) {
        Trie trie = new Trie();
        for (String w : words) {
            trie.insert(w);
        }
        return trie;
    }

    private void dfs(char[][] board, int i, int j, Trie p, String currWord, Set<String> res) {
        currWord += String.valueOf(board[i][j]);

        if (!p.startsWith(currWord)) return;
        if (p.search(currWord)) {
            res.add(currWord);
        }
        char tmp = board[i][j];
        board[i][j] = '@';
        for (int k = 0; k < dx.length; k++) {
            int tmp_x = i + dx[k];
            int tmp_y = j + dy[k];
            if (0 <= tmp_x && tmp_x < board.length && 0 <= tmp_y && tmp_y < board[0].length && board[tmp_x][tmp_y] != '@') {
                dfs(board, tmp_x, tmp_y, p, currWord, res);
            }
        }
        board[i][j] = tmp;
    }

    private List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();
        Trie root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, "", res);
            }
        }
        return new LinkedList<String>(res);
    }

    public static void main(String[] args) {
        String[] s = {
                "oath", "pea", "eat", "rain", "ad", "add",
                "ta", "tat"};
        LeetCode_6_212 test = new LeetCode_6_212();
//        Trie trie = algo.tzashinorpu.test.buildTrie(s);
        char[][] board = {
                {'o', 'a', 'a', 'n'},
                {'e', 't', 'a', 'e'},
                {'i', 'h', 'a', 'd'},
                {'i', 'f', 'l', 'd'}
        };
        List<String> words = test.findWords(board, s);
        for (String w : words) {
            System.out.println(w);
        }
    }
}
