package invertTree

import (
	"Week03/Tree/BinaryTree"
	PreorderTraversal "Week03/Tree/BinaryTree/144"
	"fmt"
	"testing"
)

func TestInvertTree(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 4}
	root.Left = &BinaryTree.TreeNode{Val: 2}
	root.Right = &BinaryTree.TreeNode{Val: 7}
	root.Left.Left = &BinaryTree.TreeNode{Val: 1}
	root.Left.Right = &BinaryTree.TreeNode{Val: 3}
	root.Right.Left = &BinaryTree.TreeNode{Val: 6}
	root.Right.Right = &BinaryTree.TreeNode{Val: 9}

	fmt.Println(PreorderTraversal.PreorderTraversal(root))
	tree := invertTree(root)
	fmt.Println(PreorderTraversal.PreorderTraversal(tree))
}
