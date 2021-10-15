package algo.tzashinorpu.Week02.Chapter08;

import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_2_078Test {

    @Test
    void subsets() {
        LeetCode_2_078 instance = new LeetCode_2_078();
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = instance.subsets1(nums);
        System.out.println(res);
        res = instance.subsets2(nums);
        System.out.println(res);
    }
}