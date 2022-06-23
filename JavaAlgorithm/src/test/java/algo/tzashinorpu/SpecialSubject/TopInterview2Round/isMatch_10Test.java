package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isMatch_10Test {

    @Test
    void isMatch_dfs() {
        isMatch_10 ins = new isMatch_10();
        System.out.println(ins.isMatch_dfs("aa", ".*"));
        System.out.println(ins.isMatch_dfs("aa", "a"));
    }
}