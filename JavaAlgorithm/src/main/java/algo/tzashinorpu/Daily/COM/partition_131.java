package algo.tzashinorpu.Daily.COM;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class partition_131 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        LinkedList<String> l = new LinkedList<>();
        dfs(l, s, "");
        return res;
    }

    // "aab"
    private void dfs(LinkedList<String> list, String remain, String curr) {
        if (remain.equals("")) {
            this.res.add((List<String>) list.clone());
            return;
        }

        for (int i = 0; i < remain.length(); i++) {
            String s = remain.substring(0, i + 1);
            if (validPalindrome(s)) {
                list.offerLast(s);
                dfs(list, remain.substring(i + 1), s);
                list.pollLast();
            }
        }
    }

    private boolean validPalindrome(String temp) {
        if (temp.length() == 0) {
            return false;
        }
        // "aa" "aba"
        for (int l = 0, r = temp.length() - 1; l <= r; l++, r--) {
            if (temp.charAt(l) != temp.charAt(r)) {
                return false;
            }
        }
        return true;
    }
}
