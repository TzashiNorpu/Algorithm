package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class totalSteps_2289Test {

    @Test
    void totalSteps() {
        totalSteps_2289 ins = new totalSteps_2289();
        int[] A1 = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};
        int[] A2 = {10, 2, 5, 2, 3, 4};
        System.out.println(ins.totalSteps(A1));
        System.out.println(ins.totalSteps(A2));
    }
}