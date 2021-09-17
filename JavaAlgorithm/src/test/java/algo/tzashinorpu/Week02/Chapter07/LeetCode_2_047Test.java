package algo.tzashinorpu.Week02.Chapter07;

import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_2_047Test {

    @Test
    void permuteUnique() {
        LeetCode_2_047 instance = new LeetCode_2_047();
        int[] ints = {1, 2, 1};
        List<List<Integer>> res = instance.permuteUnique(ints);
        System.out.println(res);
    }
}