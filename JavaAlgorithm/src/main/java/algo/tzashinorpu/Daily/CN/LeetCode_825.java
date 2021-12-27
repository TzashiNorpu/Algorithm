package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;

public class LeetCode_825 {
    // brute force
    public int numFriendRequests1(int[] ages) {
        int ans = 0;
        int length = ages.length;
        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                if (x == y) {
                    continue;
                }
                if (ages[y] > ages[x] || ages[y] <= ages[x] * 0.5 + 7 || (ages[x] < 100 && ages[y] > 100)) {
                    continue;
                }
                ans++;
            }
        }
        return ans;
    }

    /*age[y] <= 0.5 * age[x] + 7
    age[y] > age[x]
    age[y] > 100 && age[x] < 100
    ->
    y<=x && y<=0.5x+7时x向y发出申请
    l<->x<->r
    */
    // 超时  因为每次都在新建窗口，可以根据上次的窗口动态调整窗口的位置
    public int numFriendRequests2(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        int length = ages.length;
        for (int x = 0, l = x, r = x; x < length; x++, l = x, r = x) {
            while (l >= 0 && ages[l] <= ages[x] && ages[l] > (0.5 * ages[x] + 7)) {
                l--;
            }
            if (x != l) ans += x - l - 1;
            while (r < length && ages[r] == ages[x] && ages[r] > (0.5 * ages[x] + 7)) {
                r++;
            }
            if (l != r) ans += r - x - 1;
        }
        return ans;
    }

    // 利用之前的位置进行窗口维护
    public int numFriendRequests2_1(int[] ages) {
        int ans = 0;
        Arrays.sort(ages);
        int length = ages.length;
        for (int x = 0, l = x, r = x + 1; x < length; ) {
            // 左边界在当前元素无法发请求时左移
            while (l >= 0 && l < x && ages[l] <= (0.5 * ages[x] + 7)) {
                l++;
            }
            // 右边界在当前元素可以发送请求时右移
            while (r < length && ages[r] == ages[x] && ages[r] > (0.5 * ages[x] + 7)) {
                r++;
            }
            if (r != l) ans += r - l - 1;
            // 右边界不移动时用元素位置更新
            r = Math.max(r, ++x);
        }
        return ans;
    }


    // y 的角度来说，可总结为：年龄比我小的不考虑（同龄的可以），年龄比我大可以考虑，但是不能超过一定范围则不考虑
    public int numFriendRequests3(int[] ages) {
        Arrays.sort(ages);
        int ans = 0;
        int length = ages.length;
        for (int k = 0, i = 0, j = 0; k < length; k++) {
            while (i < k && !check(ages[i], ages[k])) {
                i++;
            }
            if (j < k) j = k;
            while (j < length && check(ages[j], ages[k])) {
                j++;
            }
            if (j > i) {
                ans += j - i - 1;
            }
        }
        return ans;
    }

    private boolean check(int x, int y) {
        if ((y <= 0.5 * x + 7) || (y > x) || (y > 100 && x < 100)) {
            return false;
        }
        return true;
    }
}
