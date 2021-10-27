package mergeTwoLists

type ListNode struct {
	Val  int
	Next *ListNode
}

func mergeTwoLists(l1 *ListNode, l2 *ListNode) *ListNode {
	dummy := ListNode{Val: -1}
	traverse := &dummy
	for l1 != nil && l2 != nil {
		if l1.Val <= l2.Val {
			traverse.Next = l1
			l1 = l1.Next
		} else {
			traverse.Next = l2
			l2 = l2.Next
		}
		traverse = traverse.Next
	}
	if l1 == nil {
		traverse.Next = l2
	}
	if l2 == nil {
		traverse.Next = l1
	}
	return dummy.Next
}
