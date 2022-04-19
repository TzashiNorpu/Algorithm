package algo.tzashinorpu.ThirdRound.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class search_33Test {

    @Test
    void search() {
        search_33 ins = new search_33();
        int target = 0;
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(ins.search(nums, target));
    }
}