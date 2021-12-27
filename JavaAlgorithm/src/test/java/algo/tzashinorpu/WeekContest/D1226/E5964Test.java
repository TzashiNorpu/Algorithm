package algo.tzashinorpu.WeekContest.D1226;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class E5964Test {

    @Test
    void executeInstructions() {
        E5964 ins1 = new E5964();
        System.out.println(Arrays.toString(ins1.executeInstructions(3, new int[]{0, 1}, "RRDDLU")));

        E5964 ins2 = new E5964();
        System.out.println(Arrays.toString(ins2.executeInstructions(2, new int[]{1, 1}, "LURD")));
    }
}