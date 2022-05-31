package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class removeKdigits_402 {
    public String removeKdigits(String num, int k) {
        // Input: num = "5432219", k = 2 Output: "32219"
        // Input: num = "5436219", k = 2 Output: "43219"
        int len = num.length();
        String res = num.substring(len - k);
        //单调递增
        char[] chars = num.substring(0, len - k).toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(num.charAt(0));
        // 移除最大的 k 个数
        for (int i = 1; i < len - k; i++) {
            if (stack.size() == 1 && chars[i] == '0') stack.pop();
            while (!stack.empty() && chars[i] <= stack.peek()) stack.pop();
            stack.push(chars[i]);
        }
        return res;
    }
}
