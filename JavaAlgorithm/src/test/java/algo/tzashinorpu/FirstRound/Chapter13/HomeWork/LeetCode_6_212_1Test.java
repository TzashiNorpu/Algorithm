package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_6_212_1Test {

    @Test
    void findWords() {
        LeetCode_6_212_1 ins = new LeetCode_6_212_1();
        /*char[][] board1 = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] word1 = {"oath", "pea", "eat", "rain"};
        System.out.println(ins.findWords(board1, word1));
        System.out.println(ins.findWords2(board1, word1));

        char[][] board2 = {{'a'}};
        String[] word2 = {"ab"};
        System.out.println(ins.findWords(board2, word2));
        System.out.println(ins.findWords2(board2, word2));

        char[][] board3 = {{'a', 'b', 'c'}, {'a', 'e', 'd'}, {'a', 'f', 'g'}};
        String[] word3 = {"abcdefg", "gfedcbaaa", "eaabcdgfa", "befa", "dgc", "ade"};
        System.out.println(ins.findWords(board3, word3));
        System.out.println(ins.findWords2(board3, word3));

        char[][] board4 = {{'a'}};
        String[] word4 = {"a"};
        System.out.println(ins.findWords(board4, word4));
        System.out.println(ins.findWords2(board4, word4));*/

        char[][] board5 = {{'o', 'a', 'b', 'n'}, {'o', 't', 'a', 'e'}, {'a', 'h', 'k', 'r'}, {'a', 'f', 'l', 'v'}};
        String[] word5 = {"oa", "oaa"};
        System.out.println(ins.findWords(board5, word5));
        System.out.println(ins.findWords2(board5, word5));
    }
}