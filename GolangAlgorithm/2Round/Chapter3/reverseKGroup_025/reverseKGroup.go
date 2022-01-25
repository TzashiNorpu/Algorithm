package reverseKGroup_025

import "Chapter3"

func reverseKGroup(head *Chapter3.ListNode, k int) *Chapter3.ListNode {
	dummyHead := Chapter3.ListNode{Next: head}

	prev := &dummyHead
	kStart := head
	kEnd := kStart
	for kEnd != nil {
		for i := 0; i < k-1 && kEnd != nil; i++ {
			kEnd = kEnd.Next
		}
		if kEnd == nil {
			prev.Next = kStart
			break
		}
		newKStart := kEnd.Next
		kEnd.Next = nil
		reverse(kStart)
		// 同时也修改了 dummyHead 的 Next 指向
		prev.Next = kEnd
		prev = kStart
		kStart = newKStart
		kEnd = kStart
	}

	return dummyHead.Next
}

func reverse(head *Chapter3.ListNode) *Chapter3.ListNode {
	// 1->2->3
	if head == nil || head.Next == nil {
		return head
	}
	newHead := reverse(head.Next)
	head.Next.Next = head
	head.Next = nil
	return newHead
}
