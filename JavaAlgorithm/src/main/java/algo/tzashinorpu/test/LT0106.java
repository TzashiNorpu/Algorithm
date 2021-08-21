package algo.tzashinorpu.test;

public class LT0106 {
    public static void main(String[] args) {
        String s = "abbccd";
        String s1 = compressString(s);
        System.out.println(s1);
    }

    private static String compressString(String s) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        int cnt = 1;
        char prev = chars[0];
        for (int i = 1; i < chars.length; i++) {
            char curr = chars[i];
            if (curr == prev) {
                cnt++;
                prev = curr;
                continue;
            }
            res.append(prev).append(cnt);
            prev = curr;
            cnt = 1;
        }
        res.append(prev).append(cnt);
        return res.toString().length()>s.length()?s:res.toString();
    }
}
