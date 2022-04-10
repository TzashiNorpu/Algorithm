package algo.tzashinorpu.ThirdRound.Chapter03;

public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 1;
        for (int i = len - 1; i >= 0; i--) {
            int tmp = digits[i];
            digits[i] = (carry + tmp) % 10;
            carry = (carry + tmp) / 10;
        }
        if (carry == 1) {
            int[] ints = new int[len + 1];
            System.arraycopy(digits, 0, ints, 1, len);
            ints[0] = 1;
            return ints;
        }
        return digits;
    }
}
