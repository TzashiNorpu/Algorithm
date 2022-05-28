package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeKLists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummyHead = new ListNode();
        ListNode p = dummyHead;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return Integer.compare(o1.val, o2.val);
            }
        });
        for (ListNode l : lists) {
            if (l != null) queue.add(l);
        }
        while (queue.size() > 0) {
            ListNode poll = queue.poll();
            p.next = poll;
            p = p.next;
            if (poll.next != null) queue.add(poll.next);
        }
        return dummyHead.next;
    }
}
