package algo.tzashinorpu.FirstRound.Chapter09;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

class LeetCode_3_127_1Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void ladderLength() {
        LeetCode_3_127_1 instance = new LeetCode_3_127_1();
        String beginWord = "hit";
        String endWord = "cog";

        String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
        LinkedList<String> dic = new LinkedList<>(Arrays.asList(wordList));

        System.out.println(instance.ladderLength(beginWord, endWord, dic));
    }


}