package algo.tzashinorpu.SpecialSubject.DataStruct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomPickwithBlacklist_710Test {

    @Test
    void pick() {
        RandomPickwithBlacklist_710 ins = new RandomPickwithBlacklist_710(5, new int[]{4, 1});
        System.out.println(ins.pick());
    }
}