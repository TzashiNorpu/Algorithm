package algo.tzashinorpu.Week03.Chapter09;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

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