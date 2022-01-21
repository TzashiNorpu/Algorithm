package algo.tzashinorpu.Daily.CN;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class minJumps_1345 {
    public int minJumps(int[] arr) {
        // 100,-23,-23,404,100,23,23,23,3,404 -> 3
        HashMap<Integer, HashSet<Integer>> count = new HashMap<>();
        boolean[] visited = new boolean[arr.length];
        for (int i = 1; i < arr.length; i++) {
            HashSet<Integer> set = count.getOrDefault(arr[i], new HashSet<>());
            set.add(i);
            count.put(arr[i], set);
        }
        int step = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(0);
        visited[0] = true;
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Integer index = stack.poll();
                if (index == arr.length - 1) {
                    return step;
                }
                HashSet<Integer> indexs = getIndexs(index, count, visited, arr);
                stack.addAll(indexs);
            }
            step++;
        }
        return step;
    }

    private HashSet<Integer> getIndexs(Integer index, HashMap<Integer, HashSet<Integer>> count, boolean[] visited, int[] arr) {
        HashSet<Integer> res = new HashSet<>();
        if (index + 1 < visited.length && !visited[index + 1]) {
            res.add(index + 1);
            visited[index + 1] = true;
        }
        if (index - 1 >= 0 && !visited[index - 1]) {
            res.add(index - 1);
            visited[index - 1] = true;
        }
        HashSet<Integer> integers = count.get(arr[index]);
        if (integers != null) {
            res.addAll(integers);
            for (Integer idx : integers) {
                visited[idx] = true;
            }
            count.remove(arr[index]);
        }
        return res;
    }
}
