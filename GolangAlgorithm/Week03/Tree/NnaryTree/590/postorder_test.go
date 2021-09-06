package postorder

import (
	"Week03/Tree/NnaryTree"
	"fmt"
	"testing"
)

func TestPostorder(t *testing.T) {
	node5 := &NnaryTree.Node{Val: 5}
	node6 := &NnaryTree.Node{Val: 6}

	li := make([]*NnaryTree.Node, 0)
	li = append(li, node5)
	li = append(li, node6)
	node3 := &NnaryTree.Node{Val: 3, Children: li}

	node2 := &NnaryTree.Node{Val: 2}
	node4 := &NnaryTree.Node{Val: 4}

	li = make([]*NnaryTree.Node, 0)
	li = append(li, node3)
	li = append(li, node2)
	li = append(li, node4)
	node1 := &NnaryTree.Node{Val: 1, Children: li}
	fmt.Println(postorder(node1))
}
