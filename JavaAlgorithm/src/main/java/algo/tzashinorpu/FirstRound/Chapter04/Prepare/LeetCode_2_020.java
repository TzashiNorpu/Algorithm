package algo.tzashinorpu.FirstRound.Chapter04.Prepare;

import java.util.HashMap;
import java.util.Stack;

public class LeetCode_2_020 {
    // https://leetcode-cn.com/problems/valid-parentheses/
    // 有效的括号
    // 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
    // https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode/

    private HashMap<Character, Character> mappings;

    private LeetCode_2_020() {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    private boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 当前字符是开括号时  弹出栈顶元素判断是否匹配
            // 否则把字符入栈
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LeetCode_2_020 test = new LeetCode_2_020();
        System.out.println(test.isValid("()[])"));
    }
}
