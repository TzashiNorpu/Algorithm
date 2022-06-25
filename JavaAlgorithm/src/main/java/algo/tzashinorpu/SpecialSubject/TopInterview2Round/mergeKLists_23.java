package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyNode = new ListNode();
        ListNode root = dummyNode;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list != null)
                queue.add(list);
        }
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();

            if (poll.next != null) {
                queue.add(poll.next);
            }
            root.next = poll;
            root = root.next;
        }
        return dummyNode.next;
    }
}
