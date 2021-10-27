package algo.tzashinorpu.FirstRound.Chapter09;

import java.util.*;

public class LeetCode_3_126_2 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> steps = new HashMap<>();
        HashMap<String, ArrayList<String>> transferMap = new HashMap<>();
        HashSet<String> dic = new HashSet<>(wordList);
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        int step = 0;
        steps.put(beginWord, step++);
        dic.remove(beginWord);
        boolean found = false;
        while (stack.size() > 0) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String fromWord = stack.poll();
//                dic.remove(fromWord);
                char[] chars = fromWord.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (chars[j] == c) {
                            continue;
                        }
                        chars[j] = c;
                        String transformedWord = new String(chars);
                        // "dog" -> "cog" dic remove 了 cog
                        // 此时 steps 中 dog:3   log:3  cog:4
                        if (steps.containsKey(transformedWord) && step == steps.get(transformedWord)) {
                            transferMap.get(transformedWord).add(fromWord);
                        }
                        if (!dic.contains(transformedWord)) {
                            continue;
                        }
                        steps.put(transformedWord, step);
                        transferMap.putIfAbsent(transformedWord, new ArrayList<>());
                        transferMap.get(transformedWord).add(fromWord);
                        dic.remove(transformedWord);
                        stack.offer(transformedWord);
                        if (transformedWord.equals(endWord)) {
                            found = true;
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            if (found) {
                break;
            }
            step++;
        }
        if (found) {
            LinkedList<String> path = new LinkedList<>();
            dfs(beginWord, endWord, path, transferMap, res);
        }
        return res;
    }

    private void dfs(String beginWord, String endWord, LinkedList<String> path, HashMap<String, ArrayList<String>> transferMap, List<List<String>> res) {
        if (beginWord.equals(endWord)) {
            path.offerFirst(endWord);
            res.add(new ArrayList<>(path));
            path.pollFirst();
            return;
        }
        path.offerFirst(endWord);
        for (String s : transferMap.get(endWord)) {
            dfs(beginWord, s, path, transferMap, res);
        }
        path.pollFirst();
    }
}
