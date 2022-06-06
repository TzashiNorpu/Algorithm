package algo.tzashinorpu.SpecialSubject.Stack_Queue;

public class minInsertions_1541 {
    public int minInsertions(String s) {
        int leftNeed = 0, rightNeed = 0;
        for (int i = 0; i < s.length(); i++) {
            // ()
            if (s.charAt(i) == '(') {
                rightNeed += 2;
                // 当遇到左括号时，若对右括号的需求量为奇数，需要插⼊ 1 个右括号
                if (rightNeed % 2 == 1) {
                    leftNeed++;
                    rightNeed--;
                }
            }

            if (s.charAt(i) == ')') {
                rightNeed--;
                // 说明右括号太多了
                if (rightNeed == -1) {
                    // 需要插⼊⼀个左括号
                    leftNeed++;
                    // 同时，对右括号的需求变为 1
                    rightNeed = 1;
                }
            }
        }

        return leftNeed + rightNeed;
    }
}
