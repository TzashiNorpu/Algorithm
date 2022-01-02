package algo.tzashinorpu.WeekContest.D0102;

public class E5968 {
    public int numberOfBeams(String[] bank) {
        int n = bank[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append('0');
        }
        String s = sb.toString();
        int res = 0;
        for (int i = 0, cur, next; i < bank.length; i++) {
            if (!bank[i].equals(s)) {
                cur = i;
                int temp = cur;
                while (temp < bank.length - 1 && bank[++temp].equals(s)) {
                }
                next = temp;
                if (cur != next) {
                    res += count1(bank[cur]) * count1(bank[next]);
                }
                if (next == bank.length - 1) {
                    return res;
                } else {
                    i = next - 1;
                }
            }
        }
        return res;
    }

    private int count1(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}
