package algo.tzashinorpu.FirstRound.Chapter04.Prepare;

public class LeetCode_2_155 {
    // https://leetcode-cn.com/problems/min-stack/
    // 设计一个支持 push(x),pop(),top(),getMin() 操作，并能在常数时间内检索到最小元素的栈
    private int EXTEND_SIZE = 3;
    private int[] dataArray;
    private int topIndex = -1;

    public LeetCode_2_155() {
        // 初始化为 0
        dataArray = new int[EXTEND_SIZE];
//        System.out.println(dataArray.length);
    }

    public LeetCode_2_155(int len) {
        dataArray = new int[len];
    }

    private void push(int x) {
        topIndex++;

        if (topIndex == dataArray.length) {
            int[] tmp = new int[dataArray.length + EXTEND_SIZE];
            System.arraycopy(dataArray, 0, tmp, 0, topIndex);
            dataArray = tmp;
        }
        dataArray[topIndex] = x;
    }

    private void pop() {
        if (isEmpty()) {
            return;
        }
        int result = dataArray[topIndex];
        dataArray[topIndex] = 0;
        topIndex--;
//        return result;
    }

    private int top() {
        if (isEmpty()) {
            return 0;
        }
        return dataArray[topIndex];
    }

    private int getMin() {
        if (isEmpty()) {
            return 0;
        }
        int min = dataArray[0];
        for (int i = 1; i <= topIndex; i++) {
            min = Math.min(min, dataArray[i]);
        }
        return min;
    }

    private boolean isEmpty() {
        return topIndex == -1;
    }

    public static void main(String[] args) {
        LeetCode_2_155 test = new LeetCode_2_155();
        test.push(10);
        test.push(20);
        test.push(100);
//        System.out.printf("Curr min=",algo.tzashinorpu.test.getMin());
        test.pop();
        test.pop();
        test.pop();
        test.pop();
//        for (int i = 0; i < algo.tzashinorpu.test.dataArray.length; i++) {
//            System.out.println(algo.tzashinorpu.test.dataArray[i]);
//        }
        System.out.printf("Top index=%d\n", test.topIndex);
        System.out.printf("Curr top=%d\n", test.top());
        System.out.printf("Curr min=%d\n", test.getMin());
        test.push(200);

        test.push(100);

        for (int i = 0; i < test.dataArray.length; i++) {
            System.out.println(test.dataArray[i]);
        }
        System.out.printf("Curr top=%d\n", test.top());
        System.out.printf("Top index=%d\n", test.topIndex);
        System.out.printf("Curr min=%d\n", test.getMin());


    }
}
