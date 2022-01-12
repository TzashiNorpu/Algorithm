package algo.tzashinorpu.SecondRound.Chapter12;

public class countSubstrings_647 {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length() * 2 - 1; i++) {
            int left = i / 2;
            int right = left + i % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                res++;
                left--;
                right++;
            }
        }
        return res;
    }
}
