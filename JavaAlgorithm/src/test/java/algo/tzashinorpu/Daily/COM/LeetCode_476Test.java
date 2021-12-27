package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_476Test {

    @Test
    void findComplement() {
        LeetCode_476 ins = new LeetCode_476();
        System.out.println(ins.findComplement1(13));
        System.out.println(ins.findComplement1(5));
        System.out.println(ins.findComplement1(1));

        System.out.println(ins.findComplement2(13));
        System.out.println(ins.findComplement2(5));
        System.out.println(ins.findComplement2(1));
        System.out.println(ins.findComplement2(2147483647));
    }
}