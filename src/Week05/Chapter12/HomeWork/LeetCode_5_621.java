package Week05.Chapter12.HomeWork;

import java.util.ArrayList;

public class LeetCode_5_621 {
    // https://leetcode-cn.com/problems/task-scheduler/
    // 任务调度器
    // 基于按照字符出现的频率"排序"   先确定最多出现的字符的位置  再将次多出现的字符依次放置与与最多次出现字符的旁边位置
    //
    // 最多出现的字符将字符串切分成 partCount = count(A) - 1 个部分 每个部分的长度是 n
    // 每个部分剩余的位置 slot = n - (最多出现的字符个数 - 1)  总的剩余部分位置 emptySlots = partCount * slot
    // 放置完最多频率出现的字符后的剩余字符  availableTasks  = 字符长度 - 最多字符出现的次数 * 最多出现字符的个数
    //
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
        int partCount = max - 1;
        int partLength = n - (maxCount - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - max * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);

        return tasks.length + idles;
    }

    public static void main(String[] args) {
        char[] s = {'A', 'A', 'B','B','A'};
        int n = 2;
        LeetCode_5_621 test = new LeetCode_5_621();
        System.out.println(test.leastInterval1(s, n));
    }
}
