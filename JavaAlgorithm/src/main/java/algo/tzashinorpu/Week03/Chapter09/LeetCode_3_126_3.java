package algo.tzashinorpu.Week03.Chapter09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_126_3 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        List<List<String>> res = new LinkedList<>();

        HashMap<String, Integer> steps = new HashMap<>();
        steps.put(beginWord, 0);

        HashMap<String, LinkedList<String>> transferPath = new HashMap<>();

        HashSet<String> dic = new HashSet<>(wordList);
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        dic.remove(beginWord);
        int depth = 0;
        boolean found = false;
        PathBuildByBFS(endWord, steps, transferPath, dic, stack, depth, found);
        return res;
    }

    private void PathBuildByBFS(String endWord, HashMap<String, Integer> steps, HashMap<String, LinkedList<String>> transferPath, HashSet<String> dic, LinkedList<String> stack, int depth, boolean found) {
        while (!stack.isEmpty()) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                int length = chars.length;
                for (int j = 0; j < length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c < 'z'; c++) {
                        chars[j] = c;
                        String s = new String(chars);
                        if (steps.containsKey(s) && depth == steps.get(s)) {
                            transferPath.get(s).offer(poll);
                        }
                        if (dic.contains(s)) {
                            transferPath.putIfAbsent(s, new LinkedList<>());
                            transferPath.get(s).offer(poll);
                            steps.put(s, depth);
                            dic.remove(s);
                            if (s.equals(endWord)) {
                                found = true;
                            } else {
                                stack.offer(s);
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
                if (found) {
                    break;
                }
            }
        }
    }
}
