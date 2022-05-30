package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class trap_42Test {

    @Test
    void trap() {
        trap_42 ins = new trap_42();
        int[] height = {5, 5, 1, 7, 1, 1, 5, 2, 7, 6};
        System.out.println(ins.trap(height));
    }
}