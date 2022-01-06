package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class carPooling_1094Test {

    @Test
    void carPooling() {
        carPooling_1094 ins = new carPooling_1094();
        int capacity = 4;
        int[][] trips = {{9, 0, 1}, {3, 3, 7}};
        System.out.println(ins.carPooling(trips, capacity));
    }
}