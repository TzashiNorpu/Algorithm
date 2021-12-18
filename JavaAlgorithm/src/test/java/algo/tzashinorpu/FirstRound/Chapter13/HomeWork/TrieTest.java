package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    Trie trie = null;

    @BeforeEach
    void setUp() {
        // root
        trie = new Trie();
        String[] s = {"apple", "banana", "orange"};
        for (String t : s) {
            trie.insert(t);
        }
    }


    @Test
    void search() {
        System.out.println(trie.search("apple"));
    }

    @Test
    void startsWith() {
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("a"));
        System.out.println(trie.startsWith("b"));
        System.out.println(trie.startsWith("c"));
    }


}