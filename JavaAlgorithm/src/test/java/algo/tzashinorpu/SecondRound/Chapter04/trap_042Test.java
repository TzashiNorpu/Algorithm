package algo.tzashinorpu.SecondRound.Chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class trap_042Test {

    @Test
    void trap() {
        trap_042 ins = new trap_042();
        int[] ints1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(ins.trap1(ints1));
        System.out.println(ins.trap2(ints1));
        int[] ints2 = {4, 2, 0, 3, 2, 5};
        System.out.println(ins.trap1(ints2));
        System.out.println(ins.trap2(ints2));
    }
}