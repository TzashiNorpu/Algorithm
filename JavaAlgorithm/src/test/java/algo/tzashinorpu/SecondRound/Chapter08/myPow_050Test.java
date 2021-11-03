package algo.tzashinorpu.SecondRound.Chapter08;

import org.junit.jupiter.api.Test;

class myPow_050Test {

    @Test
    void myPow() {
        myPow_050 instance = new myPow_050();
        System.out.println(instance.myPow(2, 5));
        System.out.println(instance.myPow(10, -1));
        System.out.println(instance.myPow(2, -2147483648));
    }
}