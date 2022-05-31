package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeKdigits_402Test {

    @Test
    void removeKdigits() {
        removeKdigits_402 ins = new removeKdigits_402();
        System.out.println(ins.removeKdigits("5432219", 2));
        System.out.println(ins.removeKdigits("5436219", 2));
    }
}