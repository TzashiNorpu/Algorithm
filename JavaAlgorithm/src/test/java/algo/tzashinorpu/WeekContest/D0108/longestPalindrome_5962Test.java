package algo.tzashinorpu.WeekContest.D0108;

import org.junit.jupiter.api.Test;

class longestPalindrome_5962Test {

    @Test
    void longestPalindrome() {
        longestPalindrome_5962 ins = new longestPalindrome_5962();
        String[] words1 = {"dd", "aa", "bb", "dd", "aa", "ab", "ba", "cd", "cd", "dd", "bb", "dd", "aa", "cc", "bb", "cc", "dd", "cc"};
        // fqfqfo ofqfqf
        System.out.println(ins.longestPalindrome(words1));
    }
}