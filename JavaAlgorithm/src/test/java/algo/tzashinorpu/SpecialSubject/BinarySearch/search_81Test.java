package algo.tzashinorpu.SpecialSubject.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class search_81Test {

    @Test
    void search() {
        search_81 ins = new search_81();
        int[] nums1 = {1, 0};
        int[] nums2 = {0, 1};
        int[] nums3 = {1, 0, 1, 1, 1};
        int target = 0;
        System.out.println(ins.search(nums1, target));
        System.out.println(ins.search(nums2, target));
        System.out.println(ins.search(nums3, target));
    }
}