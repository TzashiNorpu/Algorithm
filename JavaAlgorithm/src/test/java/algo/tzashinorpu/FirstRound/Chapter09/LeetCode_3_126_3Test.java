package algo.tzashinorpu.FirstRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class LeetCode_3_126_3Test {

    @Test
    void findLadders() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new LinkedList<>(List.of("hot", "dot", "dog", "lot", "log", "cog"));
        LeetCode_3_126_3 instance = new LeetCode_3_126_3();
        System.out.println(instance.findLadders(beginWord, endWord, wordList));
    }
}