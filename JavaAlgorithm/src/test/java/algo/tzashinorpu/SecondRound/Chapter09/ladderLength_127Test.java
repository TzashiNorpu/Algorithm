package algo.tzashinorpu.SecondRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ladderLength_127Test {

    @Test
    void ladderLength() {
        String beginword = "hit";
        String endword = "cog";
        List<String> wordlist = new LinkedList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        ladderLength_127 instance = new ladderLength_127();
        System.out.println(instance.ladderLength(beginword, endword, wordlist));
    }
}