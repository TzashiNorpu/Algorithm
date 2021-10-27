package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_621 {
    // https://leetcode-cn.com/problems/task-scheduler/
    // 任务调度器
    // 基于按照字符出现的频率"排序"   先确定最多出现的字符的位置  再将次多出现的字符依次放置与与最多次出现字符的旁边位置
    // 3 A 3 B 2 C 1 D, n = 3  --> A B ?  A B ?  A B
    public int leastInterval1(char[] tasks, int n) {
        int[] counter = new int[26];
        int max = 0;
        int maxCount = 0;
        for (char task : tasks) {
            // counter[] task字符出现的次数
            counter[task - 'A']++;
            // 该分支只有在当前统计的字符个数
            if (max == counter[task - 'A']) {
                maxCount++;
            } else if (max < counter[task - 'A']) { //
                max = counter[task - 'A'];
                maxCount = 1;
            }
        }
        // max 字符最多次出现的次数
        // maxCount 最多次出现的字符的个数
        System.out.printf("max=%d,maxCount=%d\n", max, maxCount);
        // slotCount 可以插入子任务的 "位置部分" 统计
        // slotPartLen 每个可插入子任务的 位置部分的长度
        // slots 总的可以插入子任务的位置数
        // unarrangedTask 出现次数最多的之外的子任务
        // idles 占位的空白子任务 idles < 0 表示没有空白的占位符
        int slotPartCount = max - 1;
        int slotPartLen = n - (maxCount - 1);
        int slots = slotPartCount * slotPartLen;
        int unarrangedTask = tasks.length - max * maxCount;
        int idles = Math.max(0, slots - unarrangedTask);

        return tasks.length + idles;
    }

    public static void main(String[] args) {
        char[] s = {'A', 'A', 'B','B','C','C','D','B','A'};
        int n = 2;
        // A ? ? A ? ? A
        // A B ? A B ? A
        LeetCode_5_621 test = new LeetCode_5_621();
        System.out.println(test.leastInterval1(s, n));
    }
}
