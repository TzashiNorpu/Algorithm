package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockPrice_2034Test {
    StockPrice_2034 ins;

    @BeforeEach
    void setUp() {
        ins = new StockPrice_2034();
        ins.update(1, 10);
        ins.update(2, 5);
        ins.update(1, 2);
    }

    @Test
    void current() {
        System.out.println(ins.current());
    }

    @Test
    void maximum() {
        System.out.println(ins.maximum());
    }

    @Test
    void minimum() {
        System.out.println(ins.minimum());
    }


}