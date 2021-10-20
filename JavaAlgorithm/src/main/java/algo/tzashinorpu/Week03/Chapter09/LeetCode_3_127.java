package algo.tzashinorpu.Week03.Chapter09;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_127 {
    // BFS
    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
        LinkedList<String> stack = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        HashSet<String> set = new HashSet<>(wordList);
        int depth = 0;
        stack.offer(beginWord);
        set.remove(beginWord);
        visited.add(beginWord);
        while (stack.size() > 0) {
            depth++;
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                char[] chars = poll.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String oneLetterChangStr = new String(chars);
                        if (set.contains(oneLetterChangStr)) {
                            if (oneLetterChangStr.equals(endWord)) {
                                return depth + 1;
                            } else {
                                stack.offer(oneLetterChangStr);
                                set.remove(oneLetterChangStr);
                            }
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            /*for (int i = 0; i < size; i++) {
                String poll = stack.poll();
                for (int j = 0; j < wordList.size(); j++) {
                    String item = wordList.get(j);
                    if (poll.equals(endWord)) {
                        return depth;
                    }
                    if (visited.contains(item)) {
                        continue;
                    }
                    if (isOneLetterChange(item, poll)) {
                        stack.offer(item);
                        visited.add(item);
                    }
                }
            }*/
        }
        return 0;
    }

    private boolean isOneLetterChange(String s1, String s2) {
        int cnt = 0;
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        return cnt == 1;
    }

    // double bfs：一边从 start 依次替换单个字符，一边从 end 依次替换单个字符，在中间碰头时即为答案
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null || wordList.size() == 0) return 0;
        //hashset的好处：去重也完成了
        //开始端
        HashSet<String> start = new HashSet<>();
        //结束端
        HashSet<String> end = new HashSet<>();
        //所有字符串的字典
        HashSet<String> dic = new HashSet<>(wordList);
        start.add(beginWord);
        end.add(endWord);
        if (!dic.contains(endWord)) return 0;
        //经历过上面的一系列判定，到这里的时候，若是有路径，则最小是2，所以以2开始
        return bfs(start, end, dic, 2);
    }

    private int bfs(HashSet<String> st, HashSet<String> ed, HashSet<String> dic, int l) {
        //双端查找的时候，若是有任意一段出现了“断裂”，也就是说明不存在能够连上的路径，则直接返回0
        if (st.size() == 0) return 0;
        if (st.size() > ed.size()) {//双端查找，为了优化时间，永远用少的去找多的，比如开始的时候塞进了1000个，而结尾只有3个，则肯定是从少的那一端开始走比较好
            return bfs(ed, st, dic, l);
        }
        //BFS的标记行为，即使用过的不重复使用
        dic.removeAll(st);
        //收集下一层临近点
        HashSet<String> next = new HashSet<>();
        for (String s : st) {
            /*for (String ite : dic) {
                if (isOneLetterChange(s, ite)) {
                    if (ed.contains(ite)) {
                        return l;
                    } else {
                        next.add(ite);
                    }
                }
            }*/
            // 下面这种更快
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char tmp = arr[i];
                //变化
                for (char c = 'a'; c <= 'z'; c++) {
                    if (tmp == c) continue;
                    arr[i] = c;
                    String nstr = new String(arr);
                    if (dic.contains(nstr)) {
                        if (ed.contains(nstr)) return l;
                        else next.add(nstr);
                    }
                }
                //复原
                arr[i] = tmp;
            }
        }
        return bfs(next, ed, dic, l + 1);
    }

    public int ladderLength3(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dic = new HashSet<>(wordList);
        if (!dic.contains(endWord)) {
            return 0;
        }
        LinkedList<String> strtStack = new LinkedList<>();
        strtStack.add(beginWord);
        dic.remove(beginWord);
        LinkedList<String> endStack = new LinkedList<>();
        endStack.add(endWord);
        dic.remove(endWord);
        return doubleBfs(strtStack, endStack, dic,1);
    }

    private int doubleBfs(LinkedList<String> strtStack, LinkedList<String> endStack, HashSet<String> dic, int step) {
        while (strtStack.size() > 0 && endStack.size() > 0) {
            int strtLen = strtStack.size();
            step++;
            for (int i = 0; i < strtLen; i++) {
                char[] chars = strtStack.poll().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <='z' ; c++) {
                        chars[j]=c;
                        String oneLetterChangedWord = new String(chars);
                        if (dic.contains(oneLetterChangedWord)||endStack.contains(oneLetterChangedWord)) {
                            if (endStack.contains(oneLetterChangedWord)) {
                                return step;
                            }
                            strtStack.offer(oneLetterChangedWord);
                            dic.remove(oneLetterChangedWord);
                        }
                    }
                    chars[j] = oldChar;
                }
            }
            int endLen = endStack.size();
            step++;
            for (int i = 0; i < endLen; i++) {
                char[] chars = endStack.poll().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char oldChar = chars[j];
                    for (char c = 'a'; c <='z' ; c++) {
                        chars[j]=c;
                        String oneLetterChangedWord = new String(chars);
                        if (dic.contains(oneLetterChangedWord)||strtStack.contains(oneLetterChangedWord)) {
                            if (strtStack.contains(oneLetterChangedWord)) {
                                return step;
                            }
                            endStack.offer(oneLetterChangedWord);
                            dic.remove(oneLetterChangedWord);
                        }
                    }
                    chars[j] = oldChar;
                }
            }
        }
        return 0;
    }
}
