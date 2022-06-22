package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

import org.junit.jupiter.api.Test;

class isMatch_40Test {

    @Test
    void isMatch() {
        isMatch_40 ins = new isMatch_40();
        System.out.println(ins.isMatch("aa", "a"));
        System.out.println(ins.isMatchDp("aa", "a"));
        System.out.println(ins.isMatch("aa", "*"));
        System.out.println(ins.isMatchDp("aa", "*"));
        System.out.println(ins.isMatch("aaaaa", "*a"));
        System.out.println(ins.isMatchDp("aaaaa", "*a"));
        System.out.println(ins.isMatch("aaaaa", "?*a"));
        System.out.println(ins.isMatchDp("aaaaa", "?*a"));
        System.out.println(ins.isMatch("adceb", "*a*b"));
        System.out.println(ins.isMatchDp("adceb", "*a*b"));
        System.out.println(ins.isMatch("", "*****"));
        System.out.println(ins.isMatchDp("", "*****"));
        System.out.println(ins.isMatch("", "*****"));
        System.out.println(ins.isMatchDp("", "*****"));
        System.out.println(ins.isMatch("acdcb", "a*c?b"));
        System.out.println(ins.isMatchDp("acdcb", "a*c?b"));
    }
}