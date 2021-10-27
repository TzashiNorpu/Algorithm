package algo.tzashinorpu.FirstRound.test;

public class LT1071 {
    public static void main(String[] args) {
//        String s = "ABABAB";
//        String s1 = minRepeatStr(s);
//        System.out.println(s1);
        String str1 = "ABABAB";
        String str2 = "AB";
        if (!(str1 + str2).equals(str2 + str1)) {
            System.out.println("");
        } else {
            System.out.println(str1.substring(0, gcd(str1.length(), str2.length())));
        }
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static String minRepeatStr(String s) {
        for (int i = 1; i <= s.length(); i++) {
            String stepStr = s.substring(0, i);
            //System.out.println(stepStr);
            for (int j = i; j + stepStr.length() <= s.length(); j = j + stepStr.length()) {
//                System.out.printf("start=%d,end=%d\n",j,j+stepStr.length());
//                System.out.println(s.substring(j,j+stepStr.length()));
                int endIndex = j + stepStr.length();
                String nextStr = s.substring(j, endIndex);
                if (!stepStr.equals(nextStr)) {
                    //System.out.printf("stepStr=%s,res=%s\n",stepStr,"");
                    break;
                }
                if (endIndex == s.length()) {
                    return stepStr;
                }
            }

        }
        //System.out.printf("steStr=%s,res=%s",s,s);
        return s;
    }
}
