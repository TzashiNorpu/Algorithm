package algo.tzashinorpu.Daily.COM;

public class addBinary_067 {
    public String addBinary(String a, String b) {
        int carry = 0;
        int max = Math.max(a.length(), b.length());
        int temp1 = max;
        int min = Math.min(a.length(), b.length());
        int temp2 = min;
        String s = "";
        // "11" "1"
        while ((--temp1) != -1) {
            int sum = (max == a.length() ? (a.charAt(temp1) - '0') : (--temp2 < 0 ? 0 : (a.charAt(temp2) - '0')))
                    + (max == b.length() ? (b.charAt(temp1) - '0') : (--temp2 < 0 ? 0 : (b.charAt(temp2) - '0'))) + carry;
            s = sum % 2 + s;
            carry = sum / 2;
        }
        if ((carry + s).charAt(0) == '0') {
            return (carry + s).substring(1);
        }
        return carry + s;
    }
}
