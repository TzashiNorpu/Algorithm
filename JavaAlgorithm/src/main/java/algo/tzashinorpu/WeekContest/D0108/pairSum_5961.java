package algo.tzashinorpu.WeekContest.D0108;

import algo.tzashinorpu.Daily.COM.ListNode;

public class pairSum_5961 {
    public int pairSum(ListNode head) {
        ListNode tmp = head;
        int cnt = 0;
        while (tmp != null) {
            cnt++;
            tmp = tmp.next;
        }
        tmp = head;
        int[] arr = new int[cnt + 1];
        int index = 0;
        while (tmp != null) {
            arr[index++] = tmp.val;
            tmp = tmp.next;
        }
        int res = 0;
        int l = 0, r = index - 1;
        while (l < r) {
            res = Math.max(res, arr[l++] + arr[r--]);
        }
        return res;
    }
}
