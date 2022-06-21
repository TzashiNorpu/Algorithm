package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpanner_901Test {

    @Test
    void next() {
        StockSpanner_901 ins = new StockSpanner_901();
        System.out.println(ins.next(100));
        System.out.println(ins.next(80));
        System.out.println(ins.next(60));
        System.out.println(ins.next(70));
        System.out.println(ins.next(60));
        System.out.println(ins.next(75));
        System.out.println(ins.next(85));
    }
}