package swapPairs_24

import "Chapter3"

func swapPairs(head *Chapter3.ListNode) *Chapter3.ListNode {
	dummyHead := Chapter3.ListNode{}
	dummyHead.Next = head
	prev := &dummyHead
	for head != nil && head.Next != nil {
		node1 := head
		node2 := head.Next
		node1.Next = node2.Next
		node2.Next = node1
		prev.Next = node2
		head = node1.Next
		prev = node1
	}
	return dummyHead.Next
}
