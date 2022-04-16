package algo.tzashinorpu.ThirdRound.Chapter09;

import org.junit.jupiter.api.Test;

class minMutation_433Test {

    @Test
    void minMutation() {
        minMutation_433 ins = new minMutation_433();
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        String end = "AAACGGTA";
        String start = "AACCGGTT";
        System.out.println(ins.minMutation(start, end, bank));
    }
}