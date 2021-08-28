package reverseKGroup

type ListNode struct {
	Val  int
	Next *ListNode
}

//prev->1->2->3->4->5
func reverseKGroup(head *ListNode, k int) *ListNode {
	dummyHead := &ListNode{Next: head}

	currKPrev := dummyHead
	currKTail := dummyHead

	for {
		for i := 0; i < k && currKTail != nil; i++ {
			currKTail = currKTail.Next
		}
		if currKTail == nil {
			break
		}

		nxtKHead := currKTail.Next
		currKHead := currKPrev.Next
		currKTail.Next = nil
		currKPrev.Next = reverse(currKHead)
		currKHead.Next = nxtKHead

		currKPrev = currKHead
		currKTail = currKHead
	}

	return dummyHead.Next
}

func reverse(head *ListNode) *ListNode {
	prev := (*ListNode)(nil)
	for head != nil {
		next := head.Next
		head.Next = prev
		prev = head
		head = next
	}
	return prev
}
