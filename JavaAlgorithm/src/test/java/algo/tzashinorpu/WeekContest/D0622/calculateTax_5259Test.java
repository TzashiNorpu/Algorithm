package algo.tzashinorpu.WeekContest.D0622;

import org.junit.jupiter.api.Test;

class calculateTax_5259Test {

    @Test
    void calculateTax() {
        calculateTax_5259 ins = new calculateTax_5259();
        System.out.println(ins.calculateTax(new int[][]{{3, 50}, {7, 10}, {12, 25}}, 10));
    }
}