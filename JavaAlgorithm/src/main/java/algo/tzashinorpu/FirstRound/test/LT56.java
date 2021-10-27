package algo.tzashinorpu.FirstRound.test;

public class LT56 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 4, 6};//{1,4,10,2,1,4,3,3};
        int[] res = new int[2];
        res = singleNumbers(nums);
        for (int i :
                res) {
            System.out.println(i);
        }
    }

    private static int[] singleNumbers(int[] nums) {
        int k = 0;
        // 拿到这两个不同的数的异或结果
        for (int num :
                nums) {
            k ^= num;
        }
//        System.out.println(k);

        // 取出这个异或结果的最低位：这两个不同的数字在这个最低位上的二进制数肯定不一样，因为异或的结果就是标定出两个数字二进制不一致的位置
        // 4 ^ 1 ^ 4 ^ 6 => 1 ^ 6 = 0111 --> 两个相同数字的异或结果为 0
        // 所以这两个数字和这个异或结果的最低位的数 & 肯定有一个会为0，一个不为0

        // k = 7  0111 & 0001 <> 0 -->001
        // k = 6  0110 & 0001 = 0 --> 0110 & 0010 <> 0 --> 0010
        int mask = 1;
        while ((k & mask) == 0) {
            mask <<= 1;
        }
//        System.out.println(mask);
        int a = 0;
        int b = 0;
        for (int num :
                nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
