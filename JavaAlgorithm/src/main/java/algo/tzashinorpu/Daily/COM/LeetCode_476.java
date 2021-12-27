package algo.tzashinorpu.Daily.COM;

public class LeetCode_476 {
    public int findComplement1(int num) {
        // 13->1101   0010->2
        int high1Pos = 0;
        int temp = num;
        for (int i = 0; i < 32; i++) {
            temp = temp >>> 1;
            high1Pos++;
            if (temp == 0) {
                break;
            }
        }
        int mask = 0;
        for (int i = 0; i < high1Pos; i++) {
            mask = (mask << 1) + 1;
        }
        return (~num) & mask;
    }

    public int findComplement2(int num) {
        long a = 1;
        // num=1 时 a要为10
        // num=2147483647
        while (a <= num) {
            a = a << 1;
        }
        return (int) (a - num - 1);
    }

}
