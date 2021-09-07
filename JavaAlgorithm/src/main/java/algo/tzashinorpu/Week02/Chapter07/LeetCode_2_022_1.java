package algo.tzashinorpu.Week02.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_022_1 {
    public List<String> generateParenthesis1(int n) {
        ArrayList<String> res = new ArrayList<>();
        _generate1(res,"",n,1,1);
        return res;
    }

    private void _generate1(ArrayList<String> res, String str,int n,int l,int r) {
        if (str.length() == 2 * n) {
            res.add(str);
            return;
        }
        if (l <= n) {
            String str1 = str + "(";
            _generate1(res,str1,n,l+1,r);
        }
        if (l > r) {
            String str2 = str + ")";
            _generate1(res,str2,n,l,r+1);
        }
    }

    public List<String> generateParenthesis2(int n) {
        ArrayList<String> res = new ArrayList<>();
        _generate2(res,"",n,0,0);
        return res;
    }

    private void _generate2(ArrayList<String> res, String str,int n,int l,int r) {
        if (l == n && r==n) {
            res.add(str);
            return;
        }
        // 剪枝
        if (l < r) {
            return;
        }
        if (l < n) {
            _generate2(res,str + "(",n,l+1,r);
        }
        if (r<n){
            _generate2(res,str + ")",n,l,r+1);
        }
    }

    public static void main(String[] args) {
        LeetCode_2_022_1 sol = new LeetCode_2_022_1();
        System.out.println(sol.generateParenthesis1(2));
        System.out.println(sol.generateParenthesis2(2));
    }
}
