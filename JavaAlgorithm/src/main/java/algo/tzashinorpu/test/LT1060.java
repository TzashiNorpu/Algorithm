package algo.tzashinorpu.test;

import com.sun.scenario.animation.shared.ClipEnvelope;

public class LT1060 {
    public static void main(String[] args) {
        String s = "atach";
        String[] t = {"cat", "bt", "hat", "tree"};
        System.out.println(countCharacters(t, s));
    }
    static int countCharacters(String[] words, String chars) {
        int res = 0;
        int len =26;
        int[] cs = new int[len];
        for (char c :  chars.toCharArray()) {
            cs[c - 'a']++;
        }
        System.out.printf("chars %s count:", chars);
        for (int i :  cs) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (String word : words) {
            int[] ws = new int[len];
            for (char c : word.toCharArray()) {
                ws[c - 'a']++;
            }
            System.out.printf("word %s count:", word);
            for (int i :  ws) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            int curWordCountLen =0;
            for (int i = 0; i < len; i++) {
                if (ws[i] > cs[i]) {
                    curWordCountLen=0;
                    break;
                }
                curWordCountLen = word.length();
            }
            res += curWordCountLen;
        }
        return res;
    }
}
