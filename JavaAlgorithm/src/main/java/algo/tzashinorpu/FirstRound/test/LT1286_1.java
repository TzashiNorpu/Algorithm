package algo.tzashinorpu.FirstRound.test;

public class LT1286_1 {
    public static void main(String[] args) {
        int t=10;
        CombinationIterator1 te = new CombinationIterator1("abc", 2);
        String next = te.next();
        System.out.println(next);
        next = te.next();
        System.out.println(next);
        next = te.next();
        System.out.println(next);
        next = te.next();
        System.out.println(next);
        next = te.next();
        System.out.println(next);
//        next = te.next();
//        System.out.println(next);
        System.out.println(te.hasNext());

    }
}

class CombinationIterator1 {

    private int code;
    private int size;
    private char[] charArr;
    private int len;
    private long resLen = 0;
    private int generatedCnt = 0;

    public CombinationIterator1(String characters, int combinationLength) {
        this.charArr = characters.toCharArray();
        this.len = (1 << characters.length()) - 1;
        this.code = (1 << characters.length()) - 1;
        this.size = combinationLength;
        this.resLen = calcResCnt(characters.length(), combinationLength);
    }

    private long calcResCnt(int length, int combinationLength) {
        return fac(length) / (fac(length - combinationLength) * fac(combinationLength));
    }

    private long fac(int length) {
        long res = 1;
        for (int i = 1; i <= length; i++) {
            res *= i;
        }
        return res;
    }

    public String next() {
        String next = strGenerate(this.code);
        this.generatedCnt++;
        return next;
    }

    private String strGenerate(int code) {
        int tmp = nextCode(code);
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int len = charArr.length;
        while(tmp != 0){
            if ((tmp & 1) == 1){
                sb.insert(0, charArr[len - idx - 1]);
            }
            idx++;
            tmp = tmp >> 1;
        }
        return sb.toString();
    }

    private int nextCode(int code) {
//        for (int i = this.code+1; i < len; i++) {
        if(!hasNext()){
            return 0;
        }
        for (int i = this.code-1; i >=1; i--) {
            if (intToBinOneCnt(i) == this.size) {
                this.code = i;
                break;
            }
        }
        return this.code;
    }

    private int intToBinOneCnt(int code) {
        int cnt = 0;
        for (int i = code; i > 0; i = i / 2) {
            int mod = i % 2;
            if (mod == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public boolean hasNext() {
        return (this.resLen - this.generatedCnt) > 0;
    }
}