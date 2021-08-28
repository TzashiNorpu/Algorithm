package reverseKGroup

import (
	"fmt"
	"testing"
)

func TestReverseKGroup(t *testing.T) {
	root := &ListNode{Val: 1}
	node1 := &ListNode{Val: 2}
	root.Next = node1
	node2 := &ListNode{Val: 3}
	node1.Next = node2
	node3 := &ListNode{Val: 4}
	node2.Next = node3
	node4 := &ListNode{Val: 5}
	node3.Next = node4
	node := reverseKGroup(root, 3)
	for node != nil {
		fmt.Println(node.Val)
		node = node.Next
	}
}
