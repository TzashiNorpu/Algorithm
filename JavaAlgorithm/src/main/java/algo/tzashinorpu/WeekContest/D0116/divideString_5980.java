package algo.tzashinorpu.WeekContest.D0116;

public class divideString_5980 {
    public String[] divideString(String s, int k, char fill) {
        String[] res = new String[s.length() / k + (s.length() % k == 0 ? 0 : 1)];
        int endIndex = s.length() - s.length() % k;
        int cnt = s.length() / k;
        for (int i = 1, index = 0; i <= cnt; i++) {
            res[i - 1] = s.substring(index, i * k);
            index = i * k;
        }
        if (endIndex != s.length()) {
            String remain = s.substring(endIndex);
            for (int i = k - remain.length(); i > 0; i--) {
                remain += fill;
            }
            res[res.length - 1] = remain;
        }
        return res;
    }
}
