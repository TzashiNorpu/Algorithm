package algo.tzashinorpu.Week03.Chapter09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_127Test {

    @org.junit.jupiter.api.Test
    void ladderLength() {
       // beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
        String beginword="hit";
        String endword = "cog";

        String[] strings = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordlist = new LinkedList<>(Arrays.asList(strings));
        LeetCode_3_127 instance = new LeetCode_3_127();
        int i = instance.ladderLength(beginword, endword, wordlist);
        System.out.println(i);
    }
}