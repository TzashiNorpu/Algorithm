package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myAtoi_8Test {

    @Test
    void myAtoi() {
        myAtoi_8 ins = new myAtoi_8();
       /* System.out.println(ins.myAtoi("-91283472332"));
        System.out.println(ins.myAtoi("91283472332"));
        System.out.println(ins.myAtoi("   -42"));
        System.out.println(ins.myAtoi("4193 with words"));
        System.out.println(ins.myAtoi("words and 987"));*/
        System.out.println(ins.myAtoi("-"));
        System.out.println(ins.myAtoi("-1"));
        System.out.println(ins.myAtoi("+-12"));
    }
}