package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StockSpanner_901 {
    // 从后往前小于当前元素值的最大子串长度【包括自身】
    private Deque<Integer> indexStack;
    private Deque<Integer> valueStack;
    private int currIndex;

    public StockSpanner_901() {
        indexStack = new ArrayDeque<>();
        valueStack = new ArrayDeque<>();
        currIndex = 0;
    }

    public int next(int price) {
        // 递减
        while (!valueStack.isEmpty() && price >= valueStack.peekLast()) {
            indexStack.pollLast();
            valueStack.pollLast();
        }
        int leftIndex = indexStack.isEmpty() ? -1 : indexStack.peekLast();
        indexStack.offerLast(currIndex++);
        valueStack.offerLast(price);
        return currIndex - 1 - leftIndex;
    }

    /*Stack<int[]> stack = new Stack<>();
    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price)
            res += stack.pop()[1];
        stack.push(new int[]{price, res});
        return res;
    }*/
}
