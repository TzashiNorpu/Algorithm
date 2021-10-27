package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

public class LeetCode_2_066 {
    // https://leetcode-cn.com/problems/plus-one/
    // 数组对应的整数 +1
    public int[] plusOne(int[] digits) {
        // 一个循环就是一个进位
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        // 下面处理的是最高位的进位
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        LeetCode_2_066 test = new LeetCode_2_066();
        test.plusOne(ints);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

}
