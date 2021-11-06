package algo.tzashinorpu.SecondRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class findLadders_126Test {

    @Test
    void findLadders() {
        String beginword = "hit";
        String endword = "cog";
        List<String> wordlist = new LinkedList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        findLadders_126 instance = new findLadders_126();
        System.out.println(instance.findLadders(beginword, endword, wordlist));
    }
}