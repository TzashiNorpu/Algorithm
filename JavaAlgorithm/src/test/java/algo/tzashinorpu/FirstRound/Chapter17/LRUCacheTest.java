package algo.tzashinorpu.FirstRound.Chapter17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {
    LRUCache lru;

    @BeforeEach
    void setUp() {
        this.lru = new LRUCache(2);
    }

    @Test
    void Test1() {
        this.lru.put(1, 1);
        this.lru.put(2, 2);
        System.out.println(this.lru.get(1));
        this.lru.put(3, 3);
        System.out.println(this.lru.get(2));
        this.lru.put(4, 4);
        System.out.println(this.lru.get(1));
        System.out.println(this.lru.get(3));
        System.out.println(this.lru.get(4));
    }

    @Test
    void Test2() {
        this.lru.put(2, 6);
        this.lru.put(1, 5);
        this.lru.put(1, 2);
        System.out.println(this.lru.get(2));
    }
}