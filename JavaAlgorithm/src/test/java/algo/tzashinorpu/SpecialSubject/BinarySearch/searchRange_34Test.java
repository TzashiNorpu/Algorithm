package algo.tzashinorpu.SpecialSubject.BinarySearch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class searchRange_34Test {

    @Test
    void searchRange() {
        searchRange_34 ins = new searchRange_34();
        int[] nums = {5, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(ins.searchRange(nums, target)));
    }
}