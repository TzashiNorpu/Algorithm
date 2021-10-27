package algo.tzashinorpu.Week03.Chapter09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_126_3 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
       /* "hit" -> "hot" -> "dot" -> "dog" -> "cog"
        "hit" -> "hot" -> "lot" -> "log" -> "cog"*/

        List<List<String>> res = new LinkedList<>();

        HashMap<String, Integer> steps = new HashMap<>();
        steps.put(beginWord, 0);

        HashMap<String, LinkedList<String>> transferPath = new HashMap<>();

        HashSet<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return res;
        }
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        dic.remove(beginWord);
        int depth = 0;
        pathBuildByBFS(beginWord, endWord, steps, transferPath, dic, stack, depth, res);
        return res;
    }

    private void mapLadderBuildByDFS(String beginWord, String endWord, HashMap<String, LinkedList<String>> transferPath, LinkedList<String> temp, List<List<String>> res) {
        if (endWord.equals(beginWord)) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (String s : transferPath.get(endWord)) {
            temp.offerFirst(s);
            mapLadderBuildByDFS(beginWord, s, transferPath, temp, res);
            temp.pollFirst();
        }
    }

    private void pathBuildByBFS(String beginWord, String endWord, HashMap<String, Integer> steps, HashMap<String, LinkedList<String>> transferPath, HashSet<String> dic, LinkedList<String> stack, int depth, List<List<String>> res) {
        boolean found = false;
        while (!stack.isEmpty()) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                int length = chars.length;
                for (int j = 0; j < length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
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
            }
            if (found) {
                break;
            }
        }
        LinkedList<String> temp = new LinkedList<>();
        temp.offer(endWord);
        if (found) {
            mapLadderBuildByDFS(beginWord, endWord, transferPath, temp, res);
        }
    }
}
