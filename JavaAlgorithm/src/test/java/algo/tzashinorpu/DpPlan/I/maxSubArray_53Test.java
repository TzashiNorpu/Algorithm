package algo.tzashinorpu.DpPlan.I;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxSubArray_53Test {

    @Test
    void maxSubArray() {
        maxSubArray_53 ins = new maxSubArray_53();
        int[] sum1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ins.maxSubArray(sum1));

        // 5,4,-1,7,8
        int[] sum2 = {5, 4, -1, 7, 8};
        System.out.println(ins.maxSubArray(sum2));
    }
}