package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

class minimumMountainRemovals_1671Test {

    @Test
    void minimumMountainRemovals() {
        minimumMountainRemovals_1671 ins = new minimumMountainRemovals_1671();
        System.out.println(ins.minimumMountainRemovals_1(new int[]{9, 8, 1, 7, 6, 5, 4, 3, 2, 1}));
        System.out.println(ins.minimumMountainRemovals_1(new int[]{100, 92, 89, 77, 74, 66, 64, 66, 64}));
        System.out.println(ins.minimumMountainRemovals_1(new int[]{4, 5, 13, 17, 1, 7, 6, 11, 2, 8, 10, 15, 3, 9, 12, 14, 16}));
        System.out.println(ins.minimumMountainRemovals_1(new int[]{1, 2, 1, 3, 4, 4}));
    }

    @Test
    void minimumMountainRemovals_2() {
        minimumMountainRemovals_1671 ins = new minimumMountainRemovals_1671();
        System.out.println(ins.minimumMountainRemovals_2(new int[]{100, 92, 89, 77, 74, 66, 64, 66, 64}));
    }
}