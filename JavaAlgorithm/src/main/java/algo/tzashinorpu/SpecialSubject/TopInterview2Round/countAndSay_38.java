package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class countAndSay_38 {
    /*
     1.     1
     2.     11
     3.     21
     4.     1211
     5.     111221
     6.     312211
     7.     13112221
     8.     1113213211
     9.     31131211131221
     10.    13211311123113112211
     */
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int start = 0, pos = 0;
            while (pos < s.length()) {
                while (pos < s.length() && s.charAt(start) == s.charAt(pos)) {
                    pos++;
                }
                sb.append(pos - start).append(s.charAt(start));
                start = pos;
            }
            s = sb.toString();
        }
        return s;
    }
}
