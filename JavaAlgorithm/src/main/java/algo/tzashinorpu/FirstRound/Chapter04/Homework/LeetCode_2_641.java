package algo.tzashinorpu.FirstRound.Chapter04.Homework;

public class LeetCode_2_641 {
    // https://leetcode-cn.com/problems/design-circular-deque/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
    // 设计循环双端队列
    private int[] data;
    private int frontIndex=0;
    private int lastIndex=0;
    private int cap = 0;
    private int count = 0;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public LeetCode_2_641(int k) {
        this.data = new int[k];
        this.cap = k;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        // frontIndex 左移
        if (this.isFull()) {
            return false;
        }else {
            if (this.isEmpty()) {
                this.data[0] = value;
                this.frontIndex = this.lastIndex=0;
            }else {
                this.frontIndex=(this.frontIndex - 1 + this.cap)%this.cap;
                this.data[this.frontIndex]=value;
            }
            this.count++;
            return true;
        }
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        // lastIndex 右移
        if (this.isFull()) {
            return false;
        }else {
            if (this.isEmpty()) {
                this.data[0] = value;
                this.frontIndex = this.lastIndex=0;
            }else {
                this.lastIndex=(this.lastIndex+1 + this.cap)%this.cap;
                this.data[this.lastIndex]=value;
            }
            this.count++;
            return true;
        }
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        // frontIndex 右移
        if (this.isEmpty()) {
            return false;
        }else {
            this.count--;
            this.data[this.frontIndex]=0;
            this.frontIndex=(this.frontIndex+1 + this.cap)%this.cap;
            return true;
        }
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */

    public boolean deleteLast() {
        // lastIndex 左移
        if (this.isEmpty()) {
            return false;
        }else {
            this.count--;
            this.data[this.lastIndex]=0;
            this.lastIndex=(this.lastIndex -1+ this.cap)%this.cap;
            return true;
        }
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.data[this.frontIndex];
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.data[this.lastIndex];
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
       return this.count == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        // 0 1(l) 2 3(f)
        // 0(l) 1 2(f) 3
     /*   if (this.lastIndex >= this.frontIndex) {
            return this.size == (this.lastIndex - this.frontIndex + 1);
        }else {
//            return this.size == this.size - (this.frontIndex - this.lastIndex-1);
//            return this.size == this.size -this.frontIndex +this.lastIndex+1;
            return this.size == this.size + (this.lastIndex - this.frontIndex + 1);
        }*/
       /* return this.lastIndex >= this.frontIndex?
                this.size == (this.lastIndex - this.frontIndex + 1):
                this.size == this.size + (this.lastIndex - this.frontIndex + 1);
*/
        /*return this.lastIndex >= this.frontIndex?
                this.size -(this.lastIndex - this.frontIndex + 1)==0:
                - (this.lastIndex - this.frontIndex + 1)==0;*/

        return this.count == this.cap ;
    }

    public static void main(String[] args) {
        LeetCode_2_641 circularDeque = new LeetCode_2_641(3); // 设置容量大小为3
        System.out.println(circularDeque.insertLast(1));
        System.out.println(circularDeque.insertLast(2));
        System.out.println(circularDeque.insertFront(3));
        System.out.println(circularDeque.insertFront(4));
        System.out.println(circularDeque.getRear());
        System.out.println(circularDeque.isFull());
        System.out.println(circularDeque.deleteLast());
        System.out.println(circularDeque.insertFront(4));
        System.out.println(circularDeque.getFront());
    }
}
