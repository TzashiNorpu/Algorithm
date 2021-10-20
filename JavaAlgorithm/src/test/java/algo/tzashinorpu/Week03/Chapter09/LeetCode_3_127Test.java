package algo.tzashinorpu.Week03.Chapter09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LeetCode_3_127Test {

    @org.junit.jupiter.api.Test
    void ladderLength() {
        LeetCode_3_127 instance = new LeetCode_3_127();
        System.out.println("Test1....");
        String beginword1 = "hit";
        String endword1 = "cog";
        String[] strings1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordlist1 = new LinkedList<>(Arrays.asList(strings1));
        System.out.printf("ladderLength1 result=%d\n", instance.ladderLength1(beginword1, endword1, wordlist1));
        System.out.printf("ladderLength2 result=%d\n", instance.ladderLength2(beginword1, endword1, wordlist1));
        System.out.printf("ladderLength3 result=%d\n", instance.ladderLength3(beginword1, endword1, wordlist1));
        System.out.println("-----------------------------");
        System.out.println("Test2....");
        String beginword2 = "hit";
        String endword2 = "cog";
        String[] strings2 = {"hot", "dot", "dog", "lot", "log"};
        List<String> wordlist2 = new LinkedList<>(Arrays.asList(strings2));
        System.out.printf("ladderLength1 result=%d\n", instance.ladderLength1(beginword2, endword2, wordlist2));
        System.out.printf("ladderLength2 result=%d\n", instance.ladderLength2(beginword2, endword2, wordlist2));
        System.out.printf("ladderLength3 result=%d\n", instance.ladderLength3(beginword2, endword2, wordlist2));
        System.out.println("-----------------------------");
        System.out.println("Test3....");
        String beginword3 = "ymain";
        String endword3 = "oecij";
        String[] strings3 = {"ymann", "yycrj", "oecij", "ymcnj", "yzcrj", "yycij", "xecij", "yecij", "ymanj", "yzcnj", "ymain"};
        List<String> wordlist3 = new LinkedList<>(Arrays.asList(strings3));
        System.out.printf("ladderLength1 result=%d\n", instance.ladderLength1(beginword3, endword3, wordlist3));
        System.out.printf("ladderLength2 result=%d\n", instance.ladderLength2(beginword3, endword3, wordlist3));
        System.out.printf("ladderLength3 result=%d\n", instance.ladderLength3(beginword3, endword3, wordlist3));
        System.out.println("-----------------------------");
        System.out.println("Test4....");
        String beginword4 = "hit";
        String endword4 = "cog";
        String[] strings4 = {"hot", "dot", "dog", "lot", "log","cog"};
        List<String> wordlist4 = new LinkedList<>(Arrays.asList(strings4));
        System.out.printf("ladderLength1 result=%d\n", instance.ladderLength1(beginword4, endword4, wordlist4));
        System.out.printf("ladderLength2 result=%d\n", instance.ladderLength2(beginword4, endword4, wordlist4));
        System.out.printf("ladderLength3 result=%d\n", instance.ladderLength3(beginword4, endword4, wordlist4));
    }
}