package algo.tzashinorpu.test;

public class LT678 {
    public static void main(String[] args) {
        String s = "(***))";
        System.out.println(checkValidString2(s));

    }
    // 方法一:https://leetcode.com/problems/valid-parenthesis-string/discuss/139759/Java-Easy-solution.-No-recursion-dp-just-two-passes
    static boolean checkValidString1(String s) {
        int bal = 0;
        // 当前循环保证所有的 ( 都可以被 ) 匹配， * 剩余时可以将 * 作为空串
        // if...'('... 放在前，if...'）'...放在后  --> 起到了栈的作用
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '*') bal++;
            // 当前位置是 ） --> ( + * 的个数小于 )的个数时返回false
            // bal 先比较再减： 如拿到 ()) 的第二个） 时 通过bal知道当前左括号的数量已为0，且当前拿到的是 )，因此返回 false
            else if (bal-- == 0) return false;
        }
        if (bal == 0) return true;
        bal = 0;
        // 当前循环保证所有的 ) 都可以被 ( 匹配
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') bal++;
            else if (bal-- == 0) return false;
        }
        return true;
    }

    /**
     * 方法二：https://leetcode.com/problems/valid-parenthesis-string/discuss/107577/Short-Java-O(n)-time-O(1)-space-one-pass
     * 字符串：“(**())”
     * scan from left to right, and record counts of unpaired ‘(’ for all possible cases. For ‘(’ and ‘)’, it is straightforward, just increment and decrement all counts, respectively.
     * When the character is '*', there are three cases, ‘(’, empty, or ‘)’, we can think those three cases as three branches in the ongoing route.
     * Take “(**())” as an example. There are 6 chars:
     * ----At step 0: only one count = 1.
     * ----At step 1: the route will be diverted into three branches.
     * so there are three counts: 1 - 1, 1, 1 + 1 which is 0, 1, 2, for ‘)’, empty and ‘(’ respectively.
     * ----At step 2 each route is diverged into three routes again. so there will be 9 possible routes now.
     * -- For count = 0, it will be diverted into 0 – 1, 0, 0 + 1, which is -1, 0, 1, but when the count is -1, that means there are more ‘)’s than ‘(’s, and we need to stop early at that route, since it is invalid. we end with 0, 1.
     * -- For count = 1, it will be diverted into 1 – 1, 1, 1 + 1, which is 0, 1, 2
     * -- For count = 2, it will be diverted into 2 – 1, 2, 2 + 1, which is 1, 2, 3
     * To summarize step 2, we end up with counts of 0,1,2,3
     * ----At step 3, increment all counts --> 1,2,3,4
     * ----At step 4, decrement all counts --> 0,1,2,3
     * ----At step 5, decrement all counts --> -1, 0,1,2, the route with count -1 is invalid, so stop early at that route. Now we have 0,1,2.
     * In the very end, we find that there is a route that can reach count == 0. Which means all ‘(’ and ‘)’ are cancelled. So, the original String is valid.
     *
     * Another finding is counts of unpaired ‘(’ for all valid routes are consecutive integers. So we only need to keep a lower and upper bound of that consecutive integers to save space.
     * One case doesn’t show up in the example is: if the upper bound is negative, that means all routes have more ‘)’ than ‘(’ --> all routes are invalid --> stop and return false.
     */
    // high 是 * + ( - ) 的个数计数 --> take '*' as '(' --> high < 0 means too much ')'
    // low 是 ( - ) - [ 当此时左括号个数大于右括号个数时将 * 作为右括号] 的个数计数 --> 看 "*" + ")" 是否可以用于消除"(" ，如果 "*" + ")"
    // take '*' as ')', if there are some '(' not matched --> low > 0 , after the count finished, means too much '('
    //  在 * 作为 ) 时，为了不让 ) 的个数太多，只有在当前的 左括号 > 右括号时才将 * 作为 ） , 也即 low 的计数只会处理最多 "(" 个数量的 ")"，如果 ")" 太多high的逻辑会处理
    // * 剩余不影响，因为 * 可以作为空串; ） 剩余会在后面的逻辑处理
    // ） 剩余逻辑：
    // count("*") == count(")")   ignore ")" cause the numbers of them are equal ?
    // count("*") > count(")")  ignore the extra part of * as empty return to count("*") == count(")")
    // count("*") < count(")")    like "(*)))",low will be 0,high will be -1,return false
    //
    static boolean checkValidString2(String s) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
    }


    // TODO
    static void genAllCombinations() {

    }
}
