package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LeetCode_3_126_1Test {

    @Test
    void findLadders() {
        LeetCode_3_126_1 instance = new LeetCode_3_126_1();

        System.out.println("Test1....");
        String beginword1 = "hit";
        String endword1 = "cog";
        String[] strings1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> wordlist1 = new LinkedList<>(Arrays.asList(strings1));
        System.out.println(instance.findLadders(beginword1, endword1, wordlist1));
        System.out.println("-----------------------------");


        System.out.println("Test2....");
        String beginword2 = "qa";
        String endword2 = "sq";
        String[] strings2 = {"si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb", "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br", "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr", "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh", "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb", "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz", "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an", "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi", "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr", "pa", "he", "lr", "sq", "ye"};
        List<String> wordlist2 = new LinkedList<>(Arrays.asList(strings2));
        System.out.println(instance.findLadders(beginword2, endword2, wordlist2));
        System.out.println("-----------------------------");
    }
}