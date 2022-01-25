package mergeTwoLists_21

import "Chapter3"

func mergeTwoLists(l1 *Chapter3.ListNode, l2 *Chapter3.ListNode) *Chapter3.ListNode {
	if l1 == nil || l2 == nil {
		if l1 == nil {
			return l2
		}
		if l2 == nil {
			return l1
		}
	}
	dummyHead := &Chapter3.ListNode{}
	if l1.Val < l2.Val {
		dummyHead.Next = l1
	} else {
		dummyHead.Next = l2
	}
	connector := dummyHead
	// 1->1->2
	// 2->3->4->5
	//1->2->4
	//1->3->4
	for l1 != nil && l2 != nil {
		if l1.Val < l2.Val {
			connector.Next = l1
			l1 = l1.Next
		} else {
			connector.Next = l2
			l2 = l2.Next
		}
		connector = connector.Next
	}
	if l1 != nil {
		connector.Next = l1
	}
	if l2 != nil {
		connector.Next = l2
	}
	return dummyHead.Next
}
