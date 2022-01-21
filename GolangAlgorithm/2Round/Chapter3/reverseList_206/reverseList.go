package reverseList_206

import "Chapter3"

func reverseListDfs(head *Chapter3.ListNode) *Chapter3.ListNode {
	// [1,2,3,4,5] -> [5,4,3,2,1]
	if head == nil || head.Next == nil {
		return head
	}
	dummyHead := Chapter3.ListNode{}
	var dfs func(node *Chapter3.ListNode) *Chapter3.ListNode
	dfs = func(node *Chapter3.ListNode) *Chapter3.ListNode {
		if node.Next == nil {
			dummyHead.Next = node
			return node
		}
		dfs(node.Next).Next = node
		return node
	}
	dfs(head).Next = nil
	return dummyHead.Next
}

func reverseList(head *Chapter3.ListNode) *Chapter3.ListNode {
	// [1,2,3,4,5] -> [5,4,3,2,1]
	if head == nil || head.Next == nil {
		return head
	}
	// head:4  3  2
	// newHead:5  4  3
	newHead := reverseList(head.Next)
	// 5->4
	head.Next.Next = head
	// 4->nil
	head.Next = nil
	return newHead
}
