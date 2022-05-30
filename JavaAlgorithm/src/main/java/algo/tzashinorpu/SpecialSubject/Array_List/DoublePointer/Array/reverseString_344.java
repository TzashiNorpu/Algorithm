package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class reverseString_344 {
    public void reverseString(char[] s) {
        int len = s.length;
        // [1,2,3]
        // [1,2,3,4]
        for (int i = 0; i < len / 2; i++) {
            char tmp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = tmp;
        }
    }
}
