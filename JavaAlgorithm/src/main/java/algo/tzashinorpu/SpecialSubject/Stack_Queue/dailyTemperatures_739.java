package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class dailyTemperatures_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            while (!stack.empty() && temperatures[stack.peek()] <= temperatures[i]) stack.pop();
            res[i] = stack.empty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return res;
    }
}
