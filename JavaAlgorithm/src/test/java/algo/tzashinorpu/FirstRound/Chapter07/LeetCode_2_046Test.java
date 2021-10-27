package algo.tzashinorpu.FirstRound.Chapter07;

import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_2_046Test {

    @Test
    void permute() {
        LeetCode_2_046 instance = new LeetCode_2_046();
        int[] ints = {1, 2, 3};
        List<List<Integer>> res = instance.permute(ints);
        System.out.println(res);
    }
}