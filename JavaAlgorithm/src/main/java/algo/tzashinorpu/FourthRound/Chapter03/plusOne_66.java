package algo.tzashinorpu.FourthRound.Chapter03;

public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i];
            digits[i] = (tmp + carry) % 10;
            carry = (tmp + carry) / 10;
        }
        if (carry == 1) {
            int[] ints = new int[digits.length + 1];
            System.arraycopy(digits, 0, ints, 1, digits.length);
            ints[0] = 1;
            return ints;
        }
        return digits;
    }
}
