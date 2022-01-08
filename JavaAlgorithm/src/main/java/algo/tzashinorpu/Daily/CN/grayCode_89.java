package algo.tzashinorpu.Daily.CN;

import java.util.ArrayList;
import java.util.List;

public class grayCode_89 {
    public List<Integer> grayCode(int n) {
        // n=3  000 001 010 011 100 101 110 111
        //      000 001<->010 011<->100 101<->110 111
        // XOR
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            ans.add(gray(i));
        }
        return ans;

    }

    /**
     * 计算第 n 个格雷码
     * 格雷码计算公式：G(n) = n xor (n >> 1)
     */
    public int gray(int n) {
        return n ^ (n >> 1);
    }
}
