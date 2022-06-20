package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class finalPrices_1475 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        /*int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int pos = 502;
            for (int j = i + 1; j < len; j++) {
                if (prices[j] <= prices[i]) {
                    pos = j;
                    res[i] = prices[i] - prices[j];
                    break;
                }
            }
            if (pos == 502)
                res[i] = prices[i];
        }
        return res;*/

/*        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                prices[stack.pop()] -= prices[i];
            stack.push(i);
        }*/
        int[] stack = new int[len];
        int pos = 0;
        for (int i = 0; i < len; i++) {
            while (pos != 0 && prices[stack[pos - 1]] >= prices[i])
                prices[stack[--pos]] -= prices[i];
            stack[pos++] = i;
        }
        return prices;
    }
}
