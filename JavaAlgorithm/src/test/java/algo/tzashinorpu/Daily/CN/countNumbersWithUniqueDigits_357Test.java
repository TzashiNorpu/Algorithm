package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class countNumbersWithUniqueDigits_357Test {

    @Test
    void countNumbersWithUniqueDigits() {
        countNumbersWithUniqueDigits_357 ins = new countNumbersWithUniqueDigits_357();
        System.out.println(ins.countNumbersWithUniqueDigits(4));
    }

    @Test
    void dp() {
        countNumbersWithUniqueDigits_357 ins = new countNumbersWithUniqueDigits_357();
        System.out.println(ins.dp(1234));
    }
}