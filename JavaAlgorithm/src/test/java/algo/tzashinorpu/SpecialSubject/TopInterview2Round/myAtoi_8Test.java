package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myAtoi_8Test {

    @Test
    void myAtoi() {
        myAtoi_8 ins = new myAtoi_8();
        System.out.println(ins.myAtoi("42"));
        System.out.println(ins.myAtoi("   -42"));
        System.out.println(ins.myAtoi("4193 with words"));
        System.out.println(ins.myAtoi("-91283472332"));
    }
}