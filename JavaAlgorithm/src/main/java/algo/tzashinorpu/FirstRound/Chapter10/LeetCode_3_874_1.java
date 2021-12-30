package algo.tzashinorpu.FirstRound.Chapter10;

public class LeetCode_3_874_1 {

    public int robotSim(int[] commands, int[][] obstacles) {
        int[] start = {0, 0};
        // 0:N 1:S 2:E 3:W
        int dir = 0;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1 || commands[i] == -2) {
                dir = getDir(commands, dir, i);
            } else {
                calcPos(commands, start, dir, i, obstacles);
            }
        }
        return start[0] * start[0] + start[1] * start[1];
    }

    private void calcPos(int[] commands, int[] start, int dir, int i, int[][] obstacles) {
        // 0:N 1:S 2:E 3:W
        switch (dir) {
            case 0:
                start[1] += commands[i];
                for (int j = 0; j < obstacles.length; j++) {
                    if (start[0] == obstacles[j][0]) {
                        if (start[1] >= obstacles[j][1]) {
                            start[1] = obstacles[j][1] - 1;
                        }
                    }
                }
                break;
            case 1:
                start[1] -= commands[i];
                for (int j = 0; j < obstacles.length; j++) {
                    if (start[0] == obstacles[j][0]) {
                        if (start[1] <= obstacles[j][1]) {
                            start[1] = obstacles[j][1] + 1;
                        }
                    }
                }
                break;
            case 2:
                start[0] += commands[i];
                for (int j = 0; j < obstacles.length; j++) {
                    if (start[1] == obstacles[j][1]) {
                        if (start[0] >= obstacles[j][0]) {
                            start[0] = obstacles[j][0] - 1;
                        }
                    }
                }
                break;
            case 3:
                start[0] -= commands[i];
                for (int j = 0; j < obstacles.length; j++) {
                    if (start[1] == obstacles[j][1]) {
                        if (start[0] <= obstacles[j][0]) {
                            start[0] = obstacles[j][0] + 1;
                        }
                    }
                }
                break;
        }
    }

    private int getDir(int[] commands, int dir, int i) {
        // 0:N 1:S 2:E 3:W
        if (commands[i] == -1) {
            switch (dir) {
                case 0:
                    dir = 2;
                    break;
                case 1:
                    dir = 3;
                    break;
                case 2:
                    dir = 1;
                    break;
                case 3:
                    dir = 0;
                    break;
            }
        }
        // 0:N 1:S 2:E 3:W
        if (commands[i] == -2) {
            switch (dir) {
                case 0:
                    dir = 3;
                    break;
                case 1:
                    dir = 2;
                    break;
                case 2:
                    dir = 0;
                    break;
                case 3:
                    dir = 1;
                    break;
            }
        }
        return dir;
    }
}
