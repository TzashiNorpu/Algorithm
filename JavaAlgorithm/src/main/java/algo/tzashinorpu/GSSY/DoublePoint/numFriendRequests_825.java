package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.Arrays;

public class numFriendRequests_825 {
    public int numFriendRequestsDoublePointer(int[] ages) {
        /*
        任意一个条件为真, x 不会向 y 发送请求
        age[y] <= 0.5 * age[x] + 7 ||
        age[y] > age[x] ||
        age[y] > 100 && age[x] < 100
        x向小于自己一定范围年纪的y发出好友请求
        可以理解为y向大于自己一定范围年纪的y发出好友请求
        ===>
        全为假时 x 向 y 发送请求
        age[y] > 0.5 * age[x] + 7 &&
        age[y] <= age[x]  &&
        age[y] <= 100 || age[x] >= 100
        ===>
        0.5 * age[x] + 7 < age[y] <=age[x] 时 x -> y
        */
        /*
        # 根据题目我们知道加好友的条件需要满足如下布尔表达式：
        # ! ( (ages[y] <= 0.5 * ages[x] + 7) || (ages[y] > ages[x]) || (ages[y] > 100 && ages[x] < 100) )
        # 化简可得：
        # ages[y] > 0.5 * ages[x] + 7 && ages[y] <= ages[x] && (ages[y] <= 100 || ages[x] >= 100)
        # 也就是x和y满足以下两者之一，x就可以向y发送好友请求：
        # 1. ages[y] <= ages[x] < (ages[y] - 7) * 2 && ages[y] <= 100
        # 2. 0.5 * ages[x] + 7 < ages[y] <= ages[x] && ages[x] >= 100
        使用第二个表达式即可，因为ages[x]小于100时，ages[y]小于等于ages[x]必然就满足ages[y] <= 100，所以只要满足另一半布尔表达式的要求。
        */
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        // l,r 不能放在 while 内，会超时
        // 可以放在外部的原因是：随着 age 的逐渐增大，对应的 y 连续段的左右边界均逐渐增大（数轴上均往右移动）
        // https://mp.weixin.qq.com/s?__biz=MzU4NDE3MTEyMA==&mid=2247490510&idx=1&sn=1caa56e8871fb4236264b40048b06fb6&chksm=fd9cb0d1caeb39c75a5e0c8a80607ba94d0bdd2503615e0dc430eeb2860c3bd29dba3faa5ef5&cur_album_id=1748659352518868992&scene=189#wechat_redirect
        int l = 0, r = 0;
        for (int age : ages) {
            if (age < 15) continue;
            // l <-> r : age 符合交友的左右边界，这个 x 向这个范围的 y 发出交友申请  用 age[y] 和当前 age 的值来划定范围
            // age 即 0.5 * ages[x] + 7 < ages[y] <= ages[x] 中的 age[x]
            while (ages[l] <= 0.5 * age + 7) l++;
            // l 是第一个 ages[l] > 0.5 * age + 7 的位置
            while (r < n && ages[r] <= age) r++;
            // r 是 ages[r] > age 的第一个位置
            ans += r - l - 1;
        }
        return ans;
    }

    int N = 130;

    public int numFriendRequestsPrefixSum(int[] ages) {
        int[] nums = new int[N];
        for (int i : ages) nums[i]++;
        for (int i = 1; i < N; i++) nums[i] += nums[i - 1];
        int ans = 0;
        for (int y = 1, x = 1; y < N; y++) {
            // y 可以发好友请求的 x 范围 【x>=y】
            // 有 a 个 y
            int a = nums[y] - nums[y - 1];
            if (a == 0) continue;
            if (x < y) x = y; // ?
            while (x < N && check(x, y)) x++;
            // [y, x) 为合法的 x 范围，对于每个 y 而言，有 b 个 x
            int b = nums[x - 1] - nums[y - 1] - 1;
            if (b > 0) ans += b * a;
        }
        return ans;
    }

    boolean check(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false;
        return true;
    }

}
