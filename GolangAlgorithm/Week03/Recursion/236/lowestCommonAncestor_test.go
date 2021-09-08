package lowestCommonAncestor

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestLowestCommonAncestor(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 3}
	root.Left = &BinaryTree.TreeNode{Val: 5}
	p := root.Left
	root.Left.Left = &BinaryTree.TreeNode{Val: 6}

	q := root.Left.Left
	/*root.Left.Right = &BinaryTree.TreeNode{Val: 2}
	root.Left.Right.Left = &BinaryTree.TreeNode{Val: 7}
	root.Left.Right.Right = &BinaryTree.TreeNode{Val: 4}
	q := root.Left.Right.Right

	root.Right = &BinaryTree.TreeNode{Val: 1}
	root.Right.Left = &BinaryTree.TreeNode{Val: 0}
	root.Right.Right = &BinaryTree.TreeNode{Val: 8}*/
	fmt.Println(lowestCommonAncestor(root, p, q).Val)
}
