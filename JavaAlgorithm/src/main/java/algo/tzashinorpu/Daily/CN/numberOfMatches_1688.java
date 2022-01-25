package algo.tzashinorpu.Daily.CN;

public class numberOfMatches_1688 {
    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return (n / 2) + numberOfMatches(n % 2 == 0 ? n / 2 : (n / 2 + 1));
    }
}
