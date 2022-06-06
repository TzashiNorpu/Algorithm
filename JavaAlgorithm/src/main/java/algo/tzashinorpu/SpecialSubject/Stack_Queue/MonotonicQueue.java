package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.LinkedList;

public class MonotonicQueue<E extends Comparable<E>> {
    LinkedList<E> maxq = new LinkedList<>();

    // 标准队列 API，向队尾加⼊元素
    public void push(E elem) {
        // 维护单调递增
        // compare: Compares this object with the specified object for order.
        // Returns a negative integer, zero, or a positive integer as this object is
        // less than, equal to, or greater than the specified object
        // 当前元素小于栈尾元素->弹出
        while (!maxq.isEmpty() && maxq.getLast().compareTo(elem) > 0) {
            maxq.pollLast();
        }
        // 然后将 n 加⼊尾部
        maxq.addLast(elem);
    }


    // 标准队列 API，从队头弹出元素，符合先进先出的顺序
    public E pop() {
        return maxq.pollFirst();
    }

    // 标准队列 API，返回队列中的元素个数
    public int size() {
        return maxq.size();
    }

    // 单调队列特有 API，O(1) 时间计算队列中元素的最⼤值
    public E max() {
        return maxq.getLast();
    }

    // 单调队列特有 API，O(1) 时间计算队列中元素的最⼩值
    public E min() {
        return maxq.getFirst();
    }
}
