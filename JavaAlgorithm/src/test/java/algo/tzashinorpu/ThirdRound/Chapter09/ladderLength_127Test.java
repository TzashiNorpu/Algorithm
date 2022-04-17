package algo.tzashinorpu.ThirdRound.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.List;

class ladderLength_127Test {

    @Test
    void ladderLength() {
        ladderLength_127 ins = new ladderLength_127();
        System.out.println(ins.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
    }
}