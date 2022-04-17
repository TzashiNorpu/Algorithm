package algo.tzashinorpu.ThirdRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.List;

class findLadders_126Test {

    @Test
    void findLadders() {
        findLadders_126 ins = new findLadders_126();
       /* List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        String endWord = "cog";
        String beginWord = "hit";*/
        List<String> wordList = List.of("a", "b", "c");
        String endWord = "c";
        String beginWord = "a";
        System.out.println(ins.findLadders(beginWord, endWord, wordList));
    }
}