package algo.tzashinorpu.SecondRound.Chapter12;

public class checkRecord_552 {
    public int checkRecord(int n) {
        //  考虑A的数量，与字符串结尾处L的数量，一共6种状态
        //   (A=0,结尾处连续L=0),(0,1),(0,2),(1,0),(1,1),(1,2)
        // 初始状态就是字符数为0，此时6个状态对应的字符串数量为 1,0,0,0,0,0
        long a = 1, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 0; i < n; i++) {
            long tmp1 = a + b + c;
            long tmp2 = a + b + c + d + e + f;
            f = e;
            e = d;
            c = b;
            b = a;
            a = tmp1;
            d = tmp2;
            a = a % (1000000007);
            b = b % (1000000007);
            c = c % (1000000007);
            d = d % (1000000007);
            e = e % (1000000007);
            f = f % (1000000007);
        }
        return (int) ((a + b + c + d + e + f) % (1000000007));
    }
}
