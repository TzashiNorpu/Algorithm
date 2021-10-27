package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_126_3Test {

    @Test
    void findLadders() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new LinkedList<>(List.of(new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
        LeetCode_3_126_3 instance = new LeetCode_3_126_3();
        System.out.println(instance.findLadders(beginWord, endWord, wordList));
    }
}