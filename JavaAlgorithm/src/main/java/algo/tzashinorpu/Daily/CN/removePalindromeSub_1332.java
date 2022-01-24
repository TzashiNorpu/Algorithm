package algo.tzashinorpu.Daily.CN;

public class removePalindromeSub_1332 {
    public int removePalindromeSub(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return 2;
            }
            l++;
            r--;
        }
        return 1;
    }
}
