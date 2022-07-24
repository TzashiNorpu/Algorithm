package algo.tzashinorpu.WeekContest.D220723;

import org.junit.jupiter.api.Test;

class NumberContainers_6130Test {

    @Test
    void change() {
        NumberContainers_6130 ins = new NumberContainers_6130();
        ins.change(1, 10);
        System.out.println(ins.find(10));
        ins.change(1, 20);
        System.out.println(ins.find(10));
        System.out.println(ins.find(20));
        System.out.println(ins.find(30));
    }
}