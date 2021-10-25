package algo.tzashinorpu.Week03.Chapter09;

import java.util.*;

public class LeetCode_3_126_1 {
    public List<List<String>> res = new LinkedList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        HashSet<Character> letters = new HashSet<>();
        /*wordList.forEach(word -> {
            for (char c : word.toCharArray()) {
                letters.add(c);
            }
        });*/
//        System.out.println(letters);
        HashSet<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return res;
        }
        int targetDepth = bfs(beginWord, endWord, dic, letters);
        if (targetDepth == 0) {
            return res;
        }
        System.out.println(targetDepth);
        HashSet<String> dic2 = new HashSet<>(wordList);
        LinkedList<String> container = new LinkedList<>();
        container.offer(beginWord);
        dic2.remove(beginWord);
        dfs(beginWord, endWord, container, dic2, letters, 0, targetDepth);
        return res;
    }

    private void dfs(String beginWord, String endWord, LinkedList<String> container, HashSet<String> dic, HashSet<Character> letters, int level, int targetDepth) {
        if (level == targetDepth) {
            return;
        }
        char[] chars = beginWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char oldChar = chars[i];
//            for (char c : letters) {
                for (char c = 'a';  c<='z'; c++) {
                chars[i] = c;
                String s = new String(chars);
                if (dic.contains(s)) {
                    if (s.equals(endWord)) {
                        container.offer(s);
                        dic.remove(s);
                        LinkedList<String> clone = (LinkedList<String>) container.clone();
                        res.add(clone);
                        dic.add(s);
                        container.pollLast();
                        return;
                    } else {
                        container.offer(s);
                        dic.remove(s);
                        dfs(s, endWord, container, dic, letters, level + 1, targetDepth);
                        dic.add(s);
                        container.pollLast();
                    }
                }
            }
            chars[i] = oldChar;
        }
    }

    private int bfs(String beginWord, String endWord, HashSet<String> dic, HashSet<Character> letters) {
        LinkedList<String> stack = new LinkedList<>();
        stack.offer(beginWord);
        dic.remove(beginWord);
        int level = 0;
        while (stack.size() > 0) {
            level++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a';  c<='z'; c++) {
                   /* }
                    for (char c : letters) {*/
                        chars[j] = c;
                        String s = new String(chars);
                        if (dic.contains(s)) {
                            if (s.equals(endWord)) {
                                return level;
                            } else {
                                stack.offer(s);
                                dic.remove(s);
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
        }
        return 0;
    }

    public List<List<String>> findLadders2(String beginWord, String endWord, List<String> wordList) {
        // 记录单词出现的层数
        HashMap<String, Integer> steps = new HashMap<>();
        //　记录该单词可以从哪些单词变换而来
        HashMap<String, LinkedList<String>> from = new HashMap<>();
        List<List<String>> res = new LinkedList<>();

        HashSet<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return res;
        }
        boolean levelFound =false;
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        dic.remove(beginWord);
        steps.put(beginWord, 0);
        int step=1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String fromWord = queue.poll();
                char[] chars = fromWord.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j]=c;
                        String toWord = new String(chars);
                        // toWord 是当前层的变换　且　toWord 已经在当前层上一次变换时从　dic 中删除　时更新
                         if (steps.containsKey(toWord) && step == steps.get(toWord)) {
                            from.get(toWord).add(fromWord);
                        }
                        if (!dic.contains(toWord)) {
                            continue;
                        }
                        dic.remove(toWord);
                        queue.offer(toWord);
                        from.putIfAbsent(toWord, new LinkedList<>());
                        from.get(toWord).add(fromWord);
                        steps.put(toWord, step);
                        if (toWord.equals(endWord)) {
                                levelFound = true;
                        }
                    }
                    chars[j]=oldChar;
                }
            }
            step++;
            if (levelFound) {
                break;
            }
        }
        if (levelFound) {
            ArrayDeque<String> path = new ArrayDeque<>();
            path.add(endWord);
            dfs(from, path, beginWord, endWord, res);
        }
        return res;
    }

    private void dfs(HashMap<String, LinkedList<String>> from, ArrayDeque<String> path, String beginWord, String curr, List<List<String>> res) {
        if (curr.equals(beginWord)) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (String s : from.get(curr)) {
            path.addFirst(s);
            dfs(from, path, beginWord, s, res);
            path.remove(s);
        }
    }



}
