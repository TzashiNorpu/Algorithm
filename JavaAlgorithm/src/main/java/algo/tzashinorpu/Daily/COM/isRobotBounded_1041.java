package algo.tzashinorpu.Daily.COM;

public class isRobotBounded_1041 {
    public boolean isRobotBounded(String instructions) {
        int direction = 1; // 1:north 2:east 3:south 4:west
        int nsPosition = 0, wePosition = 0;
        char[] chars = instructions.toCharArray();
        for (char c : chars) {
            if (c == 'L') {
                if (direction == 1) {
                    direction = 5;
                }
                direction--;
            } else if (c == 'R') {
                if (direction == 4) {
                    direction = 0;
                }
                direction++;
            } else {
                if (direction == 1) {
                    nsPosition++;
                }
                if (direction == 3) {
                    nsPosition--;
                }
                if (direction == 2) {
                    wePosition++;
                }
                if (direction == 4) {
                    wePosition--;
                }
            }
        }
        // 还停留在原位置或方向未改变时有环
        if (nsPosition == 0 && wePosition == 0)
            return true;
        return direction != 1;
    }
}
