package algo.tzashinorpu.WeekContest.D0102;

import org.junit.jupiter.api.Test;

class E5968Test {

    @Test
    void numberOfBeams() {
        E5968 ins = new E5968();
        String[] bank1 = {"011001", "000000", "010100", "001000"};
        System.out.println(ins.numberOfBeams(bank1));

        String[] bank2 = {"000", "111", "000"};
        System.out.println(ins.numberOfBeams(bank2));
    }
}