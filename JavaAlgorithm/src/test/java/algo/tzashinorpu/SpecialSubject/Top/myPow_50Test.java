package algo.tzashinorpu.SpecialSubject.Top;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myPow_50Test {

    @Test
    void myPow() {
        myPow_50 ins = new myPow_50();
        System.out.println(ins.myPow(2, -2));
        System.out.println(ins.myPow(2, 2));
        System.out.println(ins.myPow(2, -2147483648));
    }
}