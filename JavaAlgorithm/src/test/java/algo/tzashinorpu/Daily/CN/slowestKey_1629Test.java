package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

class slowestKey_1629Test {

    @Test
    void slowestKey() {
        slowestKey_1629 ins = new slowestKey_1629();
        String keysPressed = "ba";
        int[] releasedTime = {1, 2};
        System.out.println(ins.slowestKey(releasedTime, keysPressed));
    }
}