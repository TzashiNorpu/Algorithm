package algo.tzashinorpu.ThirdRound.Chapter09;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;

public class minMutation_433 {
    public int minMutation(String start, String end, String[] bank) {
        int step = 0;
        HashSet<String> bankSet = new HashSet<>(List.of(bank));
        char[] genes = {'A', 'C', 'G', 'T'};
        if (bankSet.contains(end)) {
            // 最小转换 -> bfs
            ArrayDeque<String> deque = new ArrayDeque<>();
            deque.offerLast(start);
            while (!deque.isEmpty()) {
                int size = deque.size();
                step++;
                for (int i = 0; i < size; i++) {
                    char[] chars = deque.pollFirst().toCharArray();
                    for (int j = 0; j < 8; j++) {
                        char oldChar = chars[j];
                        for (int k = 0; k < 4; k++) {
                            chars[j] = genes[k];
                            String newGene = new String(chars);
                            if (newGene.equals(end)) {
                                return step;
                            }
                            if (bankSet.contains(newGene)) {
                                bankSet.remove(newGene);
                                deque.offerLast(newGene);
                            }
                        }
                        chars[j] = oldChar;
                    }
                }
            }
        }
        return -1;
    }
}
