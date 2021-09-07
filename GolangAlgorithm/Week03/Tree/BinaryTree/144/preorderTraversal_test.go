package PreorderTraversal

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestPreorderTraversal(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 1}
	root.Left = &BinaryTree.TreeNode{Val: 2}
	root.Left.Right = &BinaryTree.TreeNode{Val: 3}
	fmt.Println(PreorderTraversal(root))
}
