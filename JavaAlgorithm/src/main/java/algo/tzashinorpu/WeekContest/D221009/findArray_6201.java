package algo.tzashinorpu.WeekContest.D221009;

public class findArray_6201 {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] res = new int[n];
        res[0] = pref[0];
        // 0101  0010
        for (int i = 1; i < n; i++) {
            res[i] = pref[i - 1] ^ pref[i];
        }
        return res;
    }
}
