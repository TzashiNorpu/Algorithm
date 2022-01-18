package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class canPlaceFlowers_605Test {

    @Test
    void canPlaceFlowers() {
        canPlaceFlowers_605 ins = new canPlaceFlowers_605();
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(ins.canPlaceFlowers(flowerbed1, n1));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(ins.canPlaceFlowers(flowerbed2, n2));
    }
}