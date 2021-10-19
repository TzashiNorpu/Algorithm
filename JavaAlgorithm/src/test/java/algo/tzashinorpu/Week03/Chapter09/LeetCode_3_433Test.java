package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

class LeetCode_3_433Test {

    @Test
    void minMutation() {
        LeetCode_3_433 instance = new LeetCode_3_433();
        String start = "AAAACCCC";
        String end = "CCCCCCCC";
        String[] banks = {"AAAACCCA", "AAACCCCA", "AACCCCCA", "AACCCCCC", "ACCCCCCC", "CCCCCCCC", "AAACCCCC", "AACCCCCC"};
        System.out.println(instance.minMutation(start, end, banks));

        start = "AACCGGTT";
        end = "AACCGGTA";
        banks = new String[]{};
        System.out.println(instance.minMutation(start, end, banks));


        start = "ACG";
        end = "ACC";
        banks = new String[]{"ACT", "ACA", "ACC"};
        System.out.println(instance.minMutation(start, end, banks));

    }
}