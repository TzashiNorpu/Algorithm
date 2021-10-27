package algo.tzashinorpu.FirstRound.test;


public class LT44 {
    public static void main(String[] args) {
        System.out.println(findNthDigit(1000));
//        String s = strCreator(380);

    }

    public static int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        n = n - 1;
        int res = 0;
        int scale = 10;
        int weight = 9;
        int digits = 1;
        while (n - weight * digits * Math.pow(scale, digits - 1) >= 0) {
            n -= weight * digits * Math.pow(scale, digits - 1);
            //System.out.println(n);
            digits += 1;
        }
        int idx = n % digits;
        Double num = Math.pow(scale, digits - 1) + n / digits;
        int t1 = num.intValue();
        //digits:n位置所在范围数值的长度
        //Pos:在数值所在长度段对应的数值范围中相对于该数值范围起始位置的长度
        //Num:n位置对应的数值
        //idx:n位置对应的数值的索引位置
        System.out.printf("Digits=%d,Pos=%d,Num=%d,idx=%d\n", digits, n, num.intValue(), idx);
        // 得到 num 的 第 idx(从0开始计数) 个数字
        for (int i = 0; i < idx + 1; i++) {
            int mod = new Double(Math.pow(scale, digits - 1 - i)).intValue();
            res = t1 / mod;
            System.out.printf("Loop t1=%d ,mod=%d,res=%d  ", t1, mod, res);
            t1 = t1 % mod;
        }
        System.out.println();

        return res;
    }

    static String strCreator(int end) {

        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < end; i++) {
            tmp = tmp.append(i);
        }
        return tmp.toString();
    }
}
