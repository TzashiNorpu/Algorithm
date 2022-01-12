package algo.tzashinorpu.SecondRound.Chapter12;

public class leastInterval_621 {
    public int leastInterval(char[] tasks, int n) {
        int maxCount = 0;
        int maxCharsCount = 0;
        int[] temp = new int[26];
        for (char c : tasks) {
            temp[c - 'A']++;
            maxCount = Math.max(maxCount, temp[c - 'A']);
        }
        for (int i = 0; i < 26; i++) {
            if (temp[i] == maxCount) {
                maxCharsCount++;
            }
        }
        return Math.max((maxCount - 1) * (n + 1) + maxCharsCount, tasks.length);
    }
}
