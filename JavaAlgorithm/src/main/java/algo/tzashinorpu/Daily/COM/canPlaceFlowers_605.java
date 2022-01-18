package algo.tzashinorpu.Daily.COM;

public class canPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        if (length == 1) {
            if (n == 0) {
                return true;
            }
            return n == 1 && flowerbed[0] == 0;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        if (flowerbed[length - 2] == 0 && flowerbed[length - 1] == 0) {
            flowerbed[length - 1] = 1;
            n--;
        }

        for (int i = 1; i < length; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (n <= 0) {
                return true;
            }
        }
        return n <= 0;
    }
}
