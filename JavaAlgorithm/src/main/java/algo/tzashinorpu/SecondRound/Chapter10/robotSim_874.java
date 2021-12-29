package algo.tzashinorpu.SecondRound.Chapter10;

public class robotSim_874 {
    public int robotSim(int[] commands, int[][] obstacles) {
       /*
            -3
             w
         -2s + n0
             e
            -1
         -2 ：向左转 90 度
         -1 ：向右转 90 度
        */
        int dir = 0;
        int[] pos = new int[2];
        for (int i = 0; i < commands.length; i++) {
            int v = commands[i];
            if (v == -1 || v == -2) {
                dir = getDir(dir, v);
                continue;
            }
            crossObstacle(dir, pos, v, obstacles);
        }
        return pos[0] * pos[0] + pos[1] * pos[1];
    }

    private boolean crossObstacle(int dir, int[] pos, int steps, int[][] obstacles) {
        int tempX = pos[0];
        int tempY = pos[1];
        switch (dir) {
            case 0:
                tempY += steps;
                break;
            case -1:
                tempX += steps;
                break;
            case -2:
                tempY -= steps;
                break;
            case -3:
                tempX -= steps;
                break;
        }
        for (int i = 0; i < obstacles.length; i++) {
            if (pos[0] == obstacles[i][0]) {
                if ((pos[1] < obstacles[i][1] && tempY >= obstacles[i][1]) || (pos[1] > obstacles[i][1] && tempY <= obstacles[i][1])) {
                    return true;
                }
            }

            if (pos[1] == obstacles[i][1]) {
                if ((pos[0] < obstacles[i][0] && tempX >= obstacles[i][0]) || (pos[0] > obstacles[i][0] && tempX <= obstacles[i][0])) {
                    return true;
                }
            }
        }
        pos[0] = tempX;
        pos[1] = tempY;
        return false;
    }

    private int getDir(int dir, int turn) {
        switch (dir) {
            case 0:
                if (turn == -1) {
                    dir = -1;
                }
                if (turn == -2) {
                    dir = -3;
                }
                break;
            case -1:
                if (turn == -1) {
                    dir = -2;
                }
                if (turn == -2) {
                    dir = 0;
                }
                break;
            case -2:
                if (turn == -1) {
                    dir = -3;
                }
                if (dir == -2) {
                    dir = -1;
                }
                break;
            case -3:
                if (turn == -1) {
                    dir = 0;
                }
                if (turn == -2) {
                    dir = -2;
                }
        }
        return dir;
    }
}
