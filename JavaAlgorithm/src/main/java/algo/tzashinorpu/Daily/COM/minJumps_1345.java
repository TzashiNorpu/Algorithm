package algo.tzashinorpu.Daily.COM;

import java.util.*;

public class minJumps_1345 {
    /*输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
    输出：3
    解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。*/

    public int minJumpsBfs(int[] arr1) {
        if (arr1.length == 1) {
            return 0;
        }
        // 连续同值压缩只留头尾 1,2,1,2..........7,11 -> 还是超时
        ArrayList<Integer> temp = new ArrayList<>();
        for (int l = 0; l < arr1.length; ) {
            int r = l + 1;
            if (l == arr1.length - 1 || arr1[l] != arr1[r]) {
                temp.add(arr1[l]);
                l++;
            } else {
                while (r < arr1.length && arr1[r - 1] == arr1[r]) {
                    r++;
                }
                temp.add(arr1[l]);
                temp.add(arr1[r - 1]);
                l = r;
            }
        }
        Integer[] arr = temp.toArray(new Integer[temp.size()]);
        boolean[] visited = new boolean[arr.length];
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new HashSet<>());
            map.get(arr[i]).add(i);
        }

        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(0);
        int step = 0;
        visited[0] = true;
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Integer poll = stack.pollFirst();
                if (poll == arr.length - 1) {
                    return step;
                }
                HashSet<Integer> idxs = getIdxs(poll, map, arr, visited);
                stack.addAll(idxs);
            }
            step++;
        }
        return -1;
    }

    private HashSet<Integer> getIdxs(Integer index, HashMap<Integer, HashSet<Integer>> map, Integer[] arr, boolean[] visited) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> integers = map.get(arr[index]);
        // bfs出栈时不用再一次进行map遍历
        if (integers != null) {
            for (Integer v : integers) {
//                if (!visited[v]) {
                res.add(v);
                visited[v] = true;
//                }
            }
            map.remove(arr[index]);
        }

        if (index + 1 < arr.length) {
            if (!visited[index + 1]) {
                res.add(index + 1);
                visited[index + 1] = true;
            }
        }
        if (index - 1 > 0) {
            if (!visited[index - 1]) {
                res.add(index - 1);
                visited[index - 1] = true;
            }
        }
        return res;
    }
}
