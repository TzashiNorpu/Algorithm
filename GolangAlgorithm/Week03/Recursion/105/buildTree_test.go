package buildTree

import (
	"Week03/Tree/BinaryTree"
	InorderTraversal "Week03/Tree/BinaryTree/094"
	PreorderTraversal "Week03/Tree/BinaryTree/144"
	"fmt"
	"testing"
)

func TestBuildTree(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 1}
	root.Left = &BinaryTree.TreeNode{Val: 2}
	root.Left.Left = &BinaryTree.TreeNode{Val: 3}
	root.Left.Right = &BinaryTree.TreeNode{Val: 4}

	root.Right = &BinaryTree.TreeNode{Val: 5}
	root.Right.Left = &BinaryTree.TreeNode{Val: 6}
	root.Right.Right = &BinaryTree.TreeNode{Val: 7}
	fmt.Println(InorderTraversal.InorderTraversal1(root))
	fmt.Println(PreorderTraversal.PreorderTraversal(root))

}
