package algo.tzashinorpu.Random;

public class maxPower_1446 {
    public int maxPower1(String s) {
        int res = 0;
        int l = 0, r = 0;
        while (r < s.length()) {
            int count = 0;
            while (r < s.length() && s.charAt(l) == s.charAt(r)) {
                res = Math.max(res, ++count);
                r++;
            }
            l = r;
        }
        return res;
    }

    public int maxPower2(String s) {
        int a = 1;
        int b = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                a++;
            } else {
                b = Math.max(a, b);
                a = 1;
            }
        }
        return Math.max(a, b);
    }
}
