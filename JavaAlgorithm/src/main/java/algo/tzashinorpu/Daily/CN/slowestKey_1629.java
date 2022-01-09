package algo.tzashinorpu.Daily.CN;

public class slowestKey_1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int length = releaseTimes.length;
        int gap = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for (int i = 1; i < length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] >= gap) {
                char temp = keysPressed.charAt(i);
                if (releaseTimes[i] - releaseTimes[i - 1] == gap) {
                    c = (char) Math.max(c, temp);
                } else {
                    c = temp;
                }
                gap = releaseTimes[i] - releaseTimes[i - 1];
            }
        }
        return c;
    }
}
