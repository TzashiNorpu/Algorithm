package algo.tzashinorpu.SpecialSubject.Stack_Queue;

public class minAddToMakeValid_921 {
    // "()))(("
    // ")())(("
    public int minAddToMakeValid(String s) {
        int rightNeed = 0;
        int need = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                rightNeed++;
            } else {
                rightNeed--;
                if (rightNeed == -1) {
                    need++;
                    rightNeed = 0;
                }
            }

        }
        return need + rightNeed;
    }
}
