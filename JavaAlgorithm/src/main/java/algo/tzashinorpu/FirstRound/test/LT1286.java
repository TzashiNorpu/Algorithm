package algo.tzashinorpu.FirstRound.test;

public class LT1286 {
    public static void main(String[] args) {
        CombinationIterator te=new CombinationIterator("abcd",2);
        System.out.println(te.next());
    }
}

class CombinationIterator {
/*
    就迭代器而言并不需要把所有的情况预先遍历出来存储起来（数据量大的时候这个会很占内存），而是next()一次就迭代求一次
    按照字典序排序编码如下，长度为2(满足二进制编码中1的个数，通过 n&(n-1) 求出)，比如：
    abcd
    则字典序排序应该是:
    ab
    ac
    ad
    bc
    bd
    刚好可以对应二进制数，从大到小:

    1100
    1010
    1001
    0110
    0101
    0011
 */
    private int code;
    private int size;
    private char[] charArr;
    private int len;

    public CombinationIterator(String characters, int combinationLength) {
        this.charArr = characters.toCharArray();
        this.len = characters.length();
        // 2^len - 1
        this.code = (1 << len) - 1;
        this.size = combinationLength;
    }
    // 返回int二进制表示的1的个数
    private int countOne(int code){
        int count = 0;
        while(code != 0){
            // code & 1 : code 最右边一位是1则count计数 +1
            count = count +  (code & 1);
            // code 右移一位
            code = code >> 1;
        }
        return count;
    }
    //根据code的二进制表示返回字符串
    private String decode(int code){
        StringBuilder sb = new StringBuilder();
        // idx 统计code 的二进制位数，去拿匹配的字符
        int idx = 0;
        int len = charArr.length;
        while(code != 0){
            if ((code & 1) == 1){
                sb.insert(0, charArr[len - idx - 1]);
            }
            idx++;
            code = code >> 1;
        }
        return sb.toString();
    }

    public String next() {
        while(code > 0 && countOne(code) != size){
            code--;
        }
        String next = decode(code);
        code--;
        return next;
    }

    public boolean hasNext() {
        // 拿到当前 code 之后的匹配二进制要求的code树
        while(code > 0 && countOne(code) != size){
            code--;
        }
        return code > 0;
    }
}