package algo.tzashinorpu.WeekContest.D220724;

public class repeatedCharacter_6124 {
    public char repeatedCharacter(String s) {
        int n = s.length();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
            if (count[index] == 2) return s.charAt(i);
        }
        return 'a';
    }
}
