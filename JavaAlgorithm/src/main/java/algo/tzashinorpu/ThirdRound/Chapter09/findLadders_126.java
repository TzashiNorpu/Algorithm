package algo.tzashinorpu.ThirdRound.Chapter09;

import java.util.*;

public class findLadders_126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        HashSet<String> stringSet = new HashSet<>(wordList);
        ArrayDeque<String> deque = new ArrayDeque<>();
        // 光记层数不行
//        HashMap<Integer, ArrayList<String>> path = new HashMap<>();
        HashMap<String, ArrayList<String>> path = new HashMap<>();
        // 同一层会有多个单词
//        HashMap<String, Integer> path = new HashMap<>();
        HashMap<String, Integer> steps = new HashMap<>();
        int step = 1;
        boolean found = false;

        path.put(beginWord, new ArrayList<>());
        steps.put(beginWord, step);
        stringSet.remove(beginWord);
        deque.offerLast(beginWord);

        while (!deque.isEmpty()) {
            step++;
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                String fromWord = deque.pollFirst();
                char[] chars = fromWord.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (int k = 0; k < 26; k++) {
                        chars[j] = (char) ('a' + k);
                        String s = new String(chars);
                        // log -> cog
                        if (steps.containsKey(s) && step == steps.get(s)) {
                            path.putIfAbsent(fromWord, new ArrayList<>());
                            path.get(fromWord).add(s);
                        }
                        if (stringSet.contains(s)) {
                            path.putIfAbsent(fromWord, new ArrayList<>());
                            path.get(fromWord).add(s);
                            steps.put(s, step);
                            deque.offerLast(s);
                            // dog -> cog 如果移除了 cog 则无法匹配 log -> cog 的路径
                            stringSet.remove(s);
                            if (s.equals(endWord)) {
                                System.out.println(fromWord);
                                found = true;
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            // 最后一层到 endWord 的 word 找完后退出
            if (found) {
                break;
            }
        }

        if (found) {
//            System.out.println(path);
            ArrayList<String> oneSol = new ArrayList<>();
            _generate(beginWord, endWord, path, oneSol, res);
        }
        return res;
    }

    private void _generate(String beginWord, String endWord, Map<String, ArrayList<String>> path, ArrayList<String> oneSol, List<List<String>> res) {
        if (beginWord.equals(endWord)) {
            oneSol.add(endWord);
            res.add(new ArrayList<>(oneSol));
            oneSol.remove(endWord);
            return;
        }
        if (path.containsKey(beginWord)) {
            oneSol.add(beginWord);
            for (String s : path.get(beginWord)) {
                _generate(s, endWord, path, oneSol, res);
            }
            oneSol.remove(beginWord);
        }
    }
}
