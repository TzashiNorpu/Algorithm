package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class longestDiverseString_1405Test {

    @Test
    void longestDiverseString() {
        longestDiverseString_1405 ins = new longestDiverseString_1405();
        System.out.println(ins.longestDiverseStringHeap(1, 1, 7));
        System.out.println(ins.longestDiverseStringArray(1, 1, 7));
    }
}