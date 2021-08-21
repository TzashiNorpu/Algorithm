package algo.tzashinorpu.Week01.Chapter03.Array;

import java.util.*;

public class ThreeSumV2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList();
        Map<Integer, List<Integer>> indexMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = indexMap.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            indexMap.put(nums[i], list);
        }

        for(int i=0; i < nums.length; i++) {
            int target = nums[i];
            for(int j =0; j < nums.length; j++) {
                if(i == j) continue;
                int complement  = -1 *( target + nums[j]);
                if(indexMap.containsKey(complement)  && getIndex(indexMap.get(complement), i, j) != -1 ) {
                    List<Integer> list = Arrays.asList(target, nums[j], nums[ getIndex(indexMap.get(complement), i, j)]);
                    Collections.sort(list);
                    if(!isMember(answer, list)) {
                        answer.add(list);
                    }
                }
            }
        }
        return answer;
    }
    int getIndex(List<Integer> idxList, int i, int j) {
        for(int x: idxList) {
            if(x != i && x!=j) {
                return x;
            }
        }
        return -1;
    }

    boolean isMember(List<List<Integer>> answers, List<Integer> target) {
        for(List<Integer> answer: answers) {
            if( answer.equals(target)) {
                return true;
            }
        }
        return  false;
    }
}
