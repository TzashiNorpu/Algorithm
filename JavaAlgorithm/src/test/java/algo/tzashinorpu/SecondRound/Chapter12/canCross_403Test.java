package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class canCross_403Test {

    @Test
    void canCross() {
        canCross_403 ins1 = new canCross_403();
        int[] stones1 = {0, 1, 3, 5, 6, 8, 12, 17};
        System.out.println(ins1.canCross1(stones1));
        canCross_403 ins2 = new canCross_403();
        int[] stones2 = {0, 1, 2, 3, 4, 8, 9, 11};
        System.out.println(ins2.canCross1(stones2));
        System.out.println(ins1.canCross2(stones1));
        System.out.println(ins1.canCross2(stones2));
    }
}