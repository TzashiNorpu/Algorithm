package algo.tzashinorpu.FirstRound.Chapter05;

import java.util.*;

public class LeetCode_2_049 {
    // https://leetcode-cn.com/problems/group-anagrams/
    public List<List<String>> groupAnagrams1(String[] strs) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            map.put(i, s);
        }
        List<List<Integer>> indexRes = new ArrayList<>();
        /*int k = map.size();
        for (int i = 0; i < k; i++) {
            String s = map.remove(i);
            if (s == null) {
                continue;
            }
            List<Integer> indexs = new ArrayList<>();
            indexs.add(i);
            for (int j = 0; j < k; j++) {
                String s1 = map.get(j);
                if (s1 == null) {
                    continue;
                }
                if (s1.equals(s)) {
                    map.remove(j);
                    indexs.add(j);
                }
            }
            indexRes.add(indexs);
        }*/


        while (map.size() > 0) {
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                List<Integer> indexs = new ArrayList<>();
                List<String> s = new ArrayList<>();
                Map.Entry<Integer, String> next1 = iterator.next();
                indexs.add(next1.getKey());
                s.add(strs[next1.getKey()]);
                iterator.remove();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, String> next2 = iterator.next();
                    if (next1.getValue().equals(next2.getValue())) {
                        indexs.add(next2.getKey());
                        s.add(strs[next2.getKey()]);
                        iterator.remove();
                    }
                }
                indexRes.add(indexs);
                res.add(s);
            }
        }

        /*map.forEach((k1,v1)->{
            List<Integer> indexs = new ArrayList<>();

            indexs.add(k1);

            map.remove(k1);
            map.forEach((k2, v2) -> {
                        if (v1.equals(v2)) {
                            indexs.add(k2);
                            map.remove(k2);
                        }
                    });
            indexRes.add(indexs);
        });*/
        return res;
    }


    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<Integer, char[]> map = new HashMap<>();

        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            map.put(i, chars);
        }
        while (map.size() > 0) {
            Iterator<Map.Entry<Integer, char[]>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                List<String> s = new ArrayList<>();
                Map.Entry<Integer, char[]> next1 = iterator.next();
                s.add(strs[next1.getKey()]);
                iterator.remove();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, char[]> next2 = iterator.next();
                    if (Arrays.equals(next1.getValue(),(next2.getValue()))) {
                        s.add(strs[next2.getKey()]);
                        iterator.remove();
                    }
                }
                res.add(s);
            }
        }
        return res;
    }


    public List<List<String>> groupAnagrams3(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String s = transfer(str);
            List<String> li = map.getOrDefault(s, new ArrayList<>());
            li.add(str);
            map.put(s, li);
        }
        return new ArrayList<>(map.values());
    }

    private String transfer(String str) {
        if (str == null || str.length()<2) return str;
        char[] chars = new char[26];
        for (int i = 0; i < str.length(); i++) {
            chars[str.charAt(i)-'a'] +=1;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        LeetCode_2_049 sol = new LeetCode_2_049();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams3(strs));
    }
}
