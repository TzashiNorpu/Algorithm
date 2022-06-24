package algo.tzashinorpu.ClassicAlgo;

import algo.tzashinorpu.ClassicAlgo.KMP.KMP;
import org.junit.jupiter.api.Test;

class KMPTest {

    @Test
    void search() {
        KMP ins = new KMP("ABABC");
        System.out.println(ins.search("ABABA"));
    }
}