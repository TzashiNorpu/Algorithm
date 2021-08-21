package algo.tzashinorpu.test;

public class LT367 {
    // num = num1 * num1

    // 超时
    private static boolean isSqrt(int num) {
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
    // 有序：二分查找
    private static boolean isSqrt2(int num) {
//        if (num < 2) {
//            return true;
//        }
        long left = 1, right = num, x, guessSqrt;
        while (left <= right) {
            // left 到 right 之间是偶数个时，x指向中间两个元素的右边元素；奇数个时，x指向中间元素；
            x = left + (right - left) / 2;
            guessSqrt = x * x;
            if (guessSqrt == num) {
                return true;
            }
            // x 的平方已经算过了，移动时移动到它旁边那一个
            right = guessSqrt > num ? x - 1 : right;
            left = guessSqrt <= num ? x + 1 : left;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 1;
        boolean is = isSqrt2(num);
        System.out.println(is);
    }
}
