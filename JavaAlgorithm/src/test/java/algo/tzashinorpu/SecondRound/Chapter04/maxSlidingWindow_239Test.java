package algo.tzashinorpu.SecondRound.Chapter04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class maxSlidingWindow_239Test {

    @Test
    void maxSlidingWindow() {
        maxSlidingWindow_239 ins = new maxSlidingWindow_239();
        int[] ints = {4, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(ins.maxSlidingWindow(ints, k)));
    }
}