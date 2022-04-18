package algo.tzashinorpu.FourthRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class findLadders_126Test {

    @Test
    void findLadders() {
        findLadders_126 ins = new findLadders_126();
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        String beginWord = "hit";
        String endWord = "cog";
        System.out.println(ins.findLadders(beginWord, endWord, wordList));
    }
}