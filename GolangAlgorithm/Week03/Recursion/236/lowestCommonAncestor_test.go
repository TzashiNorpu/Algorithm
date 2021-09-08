package lowestCommonAncestor

import (
	"Week03/Tree/BinaryTree"
	"testing"
)

func TestLowestCommonAncestor(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 3}
	root.Left = &BinaryTree.TreeNode{Val: 5}
	root.Left.Left = &BinaryTree.TreeNode{Val: 6}
	root.Left.Right = &BinaryTree.TreeNode{Val: 2}
	root.Left.Right.Left = &BinaryTree.TreeNode{Val: 7}
	root.Left.Right.Right = &BinaryTree.TreeNode{Val: 4}

	root.Right = &BinaryTree.TreeNode{Val: 1}
	root.Right.Left = &BinaryTree.TreeNode{Val: 0}
	root.Right.Right = &BinaryTree.TreeNode{Val: 8}
	p := &BinaryTree.TreeNode{Val: 5}
	q := &BinaryTree.TreeNode{Val: 4}
	lowestCommonAncestor(root, p, q)
}
