package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_427Test {

    @Test
    void findAllConcatenatedWordsInADict() {
        LeetCode_427 ins = new LeetCode_427();
        String[] s1 = {"cat", "cats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"};
        System.out.println(ins.findAllConcatenatedWordsInADict1(s1));
        ins.clearRes1();
        System.out.println(ins.findAllConcatenatedWordsInADict2(s1));
        ins.clearRes2();
        System.out.println(ins.findAllConcatenatedWordsInADict3(s1));
        String[] s2 = {"cw", "k", "c", "cwk"};
        System.out.println(ins.findAllConcatenatedWordsInADict1(s2));
        ins.clearRes1();
        System.out.println(ins.findAllConcatenatedWordsInADict2(s2));
        ins.clearRes2();
        System.out.println(ins.findAllConcatenatedWordsInADict3(s2));
    }
}