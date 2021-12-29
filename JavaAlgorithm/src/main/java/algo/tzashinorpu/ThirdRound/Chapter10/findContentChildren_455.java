package algo.tzashinorpu.ThirdRound.Chapter10;

import java.util.Arrays;

public class findContentChildren_455 {
    public int findContentChildren(int[] g, int[] s) {
        int gIdnex = 0;
        int sIndex = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gIdnex < g.length && sIndex < s.length) {
            /*if (s[sIndex] < g[gIdnex]) {
                sIndex++;
            } else {
                sIndex++;
                gIdnex++;
            }*/
            // another
            if (s[sIndex] >= g[gIdnex]) {
                gIdnex++;
            }
            sIndex++;
        }
        return gIdnex;
    }
}
