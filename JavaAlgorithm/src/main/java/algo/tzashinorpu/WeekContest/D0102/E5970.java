package algo.tzashinorpu.WeekContest.D0102;

import java.util.LinkedList;

public class E5970 {
    public int maximumInvitations(int[] favorite) {
        //
        int max = 0;

        for (int i = 0; i < favorite.length; i++) {
            LinkedList<Integer> stack = new LinkedList<>();
            stack.offer(favorite[i]);
            for (int j = i + 1; j < favorite.length; ) {
                stack.offer(favorite[stack.peek()]);
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}
