package algo.tzashinorpu.DpPlan.GSSY.Path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class change_518Test {

    @Test
    void change() {
        change_518 ins = new change_518();
        int amount = 27;
        int[] coins = {1, 2, 5, 10};
        System.out.println(ins.change1(amount, coins));
        System.out.println(ins.change2(amount, coins));
        System.out.println(ins.change3(amount, coins));
    }
}