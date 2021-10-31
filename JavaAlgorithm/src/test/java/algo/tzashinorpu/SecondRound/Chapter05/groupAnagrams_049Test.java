package algo.tzashinorpu.SecondRound.Chapter05;

import org.junit.jupiter.api.Test;

class groupAnagrams_049Test {

    @Test
    void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams_049 instance = new groupAnagrams_049();
        System.out.println(instance.groupAnagrams(strs));
    }
}