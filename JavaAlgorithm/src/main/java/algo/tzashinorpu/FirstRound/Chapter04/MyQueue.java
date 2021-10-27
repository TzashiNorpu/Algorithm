package algo.tzashinorpu.FirstRound.Chapter04;

public class MyQueue {
    // 从一端 (队尾) 添加元素  另一端 (队首) 取出元素

    //维护数据的数组
    private int[] queue;

    // 队列头部指针 : 队首元素的索引
    private int head = 0;

    // 队列尾部指针 : 队尾元素的索引
    private int tail = -1;


    // 队列元素数
    private int count = 0;

    private int initialCap = 5;

    // 构造方法  默认长度10
    private MyQueue() {
        // 默认队列长度为10
        this.queue = new int[initialCap];
    }

    // 自动扩展
    // (head - 1) == tail 队列为空
    // (head - 1) != tail && tail == length - 1 --> 追加
    // 空间   时间
    // or   (head - 1) != tail && tail == length - 1 && count <= length -1 -->  往前移(length - 1) - count 个位置
    // or   (head - 1) != tail && tail == length - 1 && count > length -1 --> 追加
    // (head - 1) == tail --> RESET
    private void autoExtend() {
        if ((head - 1) == tail) {
            // RESET
            count = 0;
            head = 0;
            tail = -1;
        }
        if ((head - 1) != tail && tail == queue.length - 1) {
            int[] tmp = new int[queue.length + initialCap];
            System.arraycopy(queue, head, tmp, 0, (tail - head + 1));
            queue = tmp;
            tail = tail - head;
            head = 0;
        }
    }

    public int insert(int data) {
        autoExtend();
        tail++;
        queue[tail] = data;
        count++;
        return data;
    }

    public int remove() {
        if (isEmpty()) {
            return 0;
        }
        int temp = queue[head];
        queue[head] = 0;
        head++;
        count--;
        return temp;
    }


    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public void print(String mark) {
        System.out.println("=========Queue Eles:===========");
        System.out.printf("Mark=%s,Header=%d,tail=%d,count=%d\n",mark,head,tail,count);
        for (int data : queue) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);
        myQueue.remove();
        myQueue.print("wwww");
        myQueue.remove();
        myQueue.remove();
        myQueue.print("eeee");
        myQueue.insert(60);
        myQueue.print("ppppp");
        myQueue.insert(70);
        myQueue.insert(80);
        myQueue.insert(90);
        myQueue.insert(100);
        myQueue.insert(110);
        myQueue.print("kkkk");
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.print("hhhhh");
    }
}
