package algo.tzashinorpu.GSSY.DoublePoint;

public class characterReplacement_424 {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int[] cnt = new int[26];
        for (int l = 0, r = 0; r < s.length(); r++) {
            cnt[s.charAt(r) - 'A']++;
            while (!valid(cnt, k)) cnt[s.charAt(l++) - 'A']--;
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    private boolean valid(int[] cnt, int k) {
        int sum = cnt[0];
        int max = cnt[0];
        for (int i = 1; i < cnt.length; i++) {
            sum += cnt[i];
            max = Math.max(max, cnt[i]);
        }
        return sum - max <= k;
    }
}
