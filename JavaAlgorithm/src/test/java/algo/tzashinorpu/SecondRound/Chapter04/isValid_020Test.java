package algo.tzashinorpu.SecondRound.Chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isValid_020Test {

    @Test
    void isValid() {
        isValid_020 instance = new isValid_020();
        String test = "((([{}])))";
        System.out.println(instance.isValid(test));
    }
}