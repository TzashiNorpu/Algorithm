package algo.tzashinorpu.Week02.Chapter08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeetCode_2_050Test {

    @Test
    void myPow() {
        double[] xs = {2, 3, 1.2, 0, 1, 2};
        int[] ns = {-2, 3, 2, 10, -2147483648, -2147483648};
        double[] es = {0.25, 27, 1.44, 0, 1, 0};
        LeetCode_2_050 instance = new LeetCode_2_050();
       /* for (int i = 0; i < xs.length; i++) {
//            System.out.println(instance.myPow1(xs[i], ns[i]));
            Assertions.assertEquals(instance.myPow1(xs[i], ns[i]), es[i]);
        }*/
        for (int i = 0; i < xs.length; i++) {
//            System.out.println(instance.myPow2(xs[i], ns[i]));
            Assertions.assertEquals(instance.myPow2(xs[i], ns[i]), es[i]);
        }
        for (int i = 0; i < xs.length; i++) {
//            System.out.println(instance.myPow3(xs[i], ns[i]));
            Assertions.assertEquals(instance.myPow3(xs[i], ns[i]), es[i]);
        }

    }
}