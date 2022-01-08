package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxDepth_1614Test {

    @Test
    void maxDepth() {
        maxDepth_1614 ins = new maxDepth_1614();
        System.out.println(ins.maxDepth("8*((1*(5+6))*(8/6))"));
        System.out.println(ins.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(ins.maxDepth("(1)+((2))+(((3)))"));
    }
}