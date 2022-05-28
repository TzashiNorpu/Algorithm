package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class productExceptSelf_238Test {

    @Test
    void productExceptSelf() {
        productExceptSelf_238 ins = new productExceptSelf_238();
        System.out.println(Arrays.toString(ins.productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(ins.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}