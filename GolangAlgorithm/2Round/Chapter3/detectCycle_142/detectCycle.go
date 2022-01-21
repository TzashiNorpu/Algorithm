package detectCycle_142

import "Chapter3"

func detectCycle(head *Chapter3.ListNode) *Chapter3.ListNode {
	slow := head
	fast := head
	ptr := head
	for slow != nil && fast != nil && fast.Next != nil {
		slow = slow.Next
		fast = fast.Next.Next
		if slow == fast {
			for slow != ptr {
				slow = slow.Next
				ptr = ptr.Next
			}
			return slow
		}
	}
	return nil
}
