package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class plusOne_66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] ints = new int[n + 1];
            ints[0] = 1;
            System.arraycopy(digits, 0, ints, 1, n);
            return ints;
        }
        return digits;
    }
}
