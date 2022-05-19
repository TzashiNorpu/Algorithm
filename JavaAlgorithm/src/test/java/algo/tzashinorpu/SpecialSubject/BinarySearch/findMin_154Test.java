package algo.tzashinorpu.SpecialSubject.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMin_154Test {

    @Test
    void findMin() {
        findMin_154 ins = new findMin_154();
        System.out.println(ins.findMin(new int[]{2, 2, 2, 0, 1}));
        System.out.println(ins.findMin(new int[]{3, 1, 3}));
        System.out.println(ins.findMin(new int[]{1, 1}));
        System.out.println(ins.findMin(new int[]{1}));
        System.out.println(ins.findMin(new int[]{10, 1, 10, 10, 10}));
    }
}