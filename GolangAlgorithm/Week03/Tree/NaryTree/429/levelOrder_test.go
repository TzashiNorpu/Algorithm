package levelOrder

import (
	"Week03/Tree/NaryTree"
	"fmt"
	"testing"
)

func TestLevelOrder(t *testing.T) {
	node5 := &NaryTree.Node{Val: 5}
	node6 := &NaryTree.Node{Val: 6}

	li := make([]*NaryTree.Node, 0)
	li = append(li, node5)
	li = append(li, node6)
	node3 := &NaryTree.Node{Val: 3, Children: li}

	node2 := &NaryTree.Node{Val: 2}
	node4 := &NaryTree.Node{Val: 4}

	li = make([]*NaryTree.Node, 0)
	li = append(li, node3)
	li = append(li, node2)
	li = append(li, node4)
	node1 := &NaryTree.Node{Val: 1, Children: li}
	fmt.Println(levelOrder(node1))
}
