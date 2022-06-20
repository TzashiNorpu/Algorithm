package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class carFleet_853Test {

    @Test
    void carFleet() {
        carFleet_853 ins = new carFleet_853();
        int[] speed = {2, 4, 1, 1, 3};
        int[] pos = {10, 8, 0, 5, 3};
        int target = 12;
        System.out.println(ins.carFleet(target, pos, speed));
    }
}