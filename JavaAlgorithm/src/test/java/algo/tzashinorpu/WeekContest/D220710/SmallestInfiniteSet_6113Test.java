package algo.tzashinorpu.WeekContest.D220710;

import org.junit.jupiter.api.Test;

class SmallestInfiniteSet_6113Test {

    @Test
    void test() {
        SmallestInfiniteSet_6113 ins = new SmallestInfiniteSet_6113();
        ins.addBack(2);
        System.out.println(ins.popSmallest());
        System.out.println(ins.popSmallest());
        System.out.println(ins.popSmallest());
        ins.addBack(1);
        System.out.println(ins.popSmallest());
        System.out.println(ins.popSmallest());
        System.out.println(ins.popSmallest());
    }

}