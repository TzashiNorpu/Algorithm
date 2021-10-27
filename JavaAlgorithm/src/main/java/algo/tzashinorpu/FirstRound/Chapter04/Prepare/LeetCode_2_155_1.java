package algo.tzashinorpu.FirstRound.Chapter04.Prepare;

public class LeetCode_2_155_1 {
    /** initialize your data structure here. */
    private int MIN_INDEX = 0;
    private int INIT_SIZE = 5;
    int size = 0;
    int cap ;
    private int[] data;
    public LeetCode_2_155_1() {
        this.data = new int[this.INIT_SIZE];
        this.cap = this.INIT_SIZE;
    }

    public void push(int val) {
        extend_size();
        this.data[this.size] = val;
        if (val < this.data[MIN_INDEX]) {
            this.MIN_INDEX = this.size;
        }
        this.size++;
    }
    private void extend_size(){
        if ((this.cap - this.size) / (this.cap*1.0) < 0.5) {
            int[] newData = new int[this.cap * 2];
            System.arraycopy(this.data,0,newData,0,this.size);
            this.data = newData;
            this.cap = this.cap*2;
        }
    }
    public void pop() {
        if (this.size == 0) {
            throw new RuntimeException("数组元素个数为0");
        }
        this.data[this.size-1] = 0;
        this.size--;
        if (this.MIN_INDEX == (this.size)) {
            this.MIN_INDEX = 0;
            for (int i = 0; i < (this.size); i++) {
                if (this.data[i] < this.data[this.MIN_INDEX]) {
                    this.MIN_INDEX = i;
                }
            }
        }
    }

    public int top() {
        return this.data[this.size-1];
    }

    public int getMin() {
        return this.data[this.MIN_INDEX];
    }

    public static void main(String[] args) {
        LeetCode_2_155_1 sol = new LeetCode_2_155_1();
        sol.push(-2);
        sol.push(0);
        sol.push(-3);
        System.out.println(sol.getMin());
        sol.pop();
        sol.top();
        System.out.println(sol.getMin());
    }
}
