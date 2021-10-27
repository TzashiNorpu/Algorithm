package algo.tzashinorpu.FirstRound.Chapter09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeetCode_3_433_1Test {
    String[] strts;
    String[] ends;
    String[][] banks;
    LeetCode_3_433_1 instance;

    @BeforeEach
    void setUp() {
        strts = new String[]{"AACCGGTT", "AACCGGTT"};
        ends = new String[]{"AACCGGTA", "AAACGGTA"};
        banks = new String[][]{{"AACCGGTA"}, {"AACCGGTA", "AACCGCTA", "AAACGGTA"}};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void minMutation() {
        instance = new LeetCode_3_433_1();
        for (int i = 0; i < strts.length; i++) {
            System.out.printf("depth = %d\n", instance.minMutation(strts[i], ends[i], banks[i]));
        }

    }
}