package algo.tzashinorpu.FourthRound.Chapter09;

import java.util.*;

public class findLadders_126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        ArrayDeque<String> deque = new ArrayDeque<>();
        HashMap<String, Integer> step = new HashMap<>();
        HashMap<String, ArrayList<String>> path = new HashMap<>();
        HashSet<String> stringSet = new HashSet<>(wordList);
        if (!stringSet.contains(endWord)) return res;
        int level = 1;
        boolean found = false;

        deque.offerLast(beginWord);
        step.put(beginWord, level);
        stringSet.remove(beginWord);

        while (!deque.isEmpty()) {
            int size = deque.size();
            level++;
            for (int i = 0; i < size; i++) {
                String fromWord = deque.pollFirst();
                char[] chars = fromWord.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char k = 'a'; k < 'z'; k++) {
                        chars[j] = k;
                        String toWord = new String(chars);
                        if (step.containsKey(toWord) && level == step.get(toWord)) {
                            path.putIfAbsent(fromWord, new ArrayList<>());
                            path.get(fromWord).add(toWord);
                        }
                        if (stringSet.contains(toWord)) {
                            stringSet.remove(toWord);
                            step.put(toWord, level);
                            path.putIfAbsent(fromWord, new ArrayList<>());
                            path.get(fromWord).add(toWord);
                            deque.offerLast(toWord);
                        }
                        if (toWord.equals(endWord)) {
                            found = true;
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            List<String> one = new ArrayList<>();
            _buildPath(beginWord, endWord, path, one, res);
        }
        return res;
    }

    private void _buildPath(String beginWord, String endWord, HashMap<String, ArrayList<String>> path, List<String> one, List<List<String>> res) {
        if (beginWord.equals(endWord)) {
            one.add(beginWord);
            res.add(new ArrayList<>(one));
            one.remove(beginWord);
            return;
        }
        one.add(beginWord);
        if (path.containsKey(beginWord)) {
            for (String s : path.get(beginWord)) {
                _buildPath(s, endWord, path, one, res);
            }
        }
        one.remove(beginWord);
    }
}
