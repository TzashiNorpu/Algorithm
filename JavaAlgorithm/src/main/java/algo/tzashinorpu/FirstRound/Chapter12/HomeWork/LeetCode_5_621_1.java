package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_621_1 {
    public int leastInterval(char[] tasks, int n) {
        int[] temp = new int[26];
        int maxCnt = 0;
        for (char c : tasks) {
            temp[c - 'A']++;
            maxCnt = Math.max(maxCnt, temp[c - 'A']);
        }
        int maxChars = 0;
        for (int i = 0; i < 26; i++) {
            if (temp[i] == maxCnt) {
                maxChars++;
            }
        }
        return Math.max(tasks.length, (maxCnt - 1) * (n + 1) + maxChars);
    }
}
