package algo.tzashinorpu.WeekContest.D0102;

public class E5967 {
    public boolean checkString(String s) {
        // ab a bb aba
        for (int aIndex = -1, bIndex = -1, i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aIndex = i;
            } else {
                bIndex = i;
            }
            if (bIndex != -1 && aIndex > bIndex) {
                return false;
            }
        }
        return true;
    }
}
