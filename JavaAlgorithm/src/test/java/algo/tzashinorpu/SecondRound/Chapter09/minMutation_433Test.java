package algo.tzashinorpu.SecondRound.Chapter09;

import org.junit.jupiter.api.Test;

class minMutation_433Test {

    @Test
    void minMutation() {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String[] banks = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        minMutation_433 instance = new minMutation_433();
        System.out.println(instance.minMutation(start, end, banks));
    }
}