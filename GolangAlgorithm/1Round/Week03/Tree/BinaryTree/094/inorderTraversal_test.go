package InorderTraversal

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestInorderTraversal(t *testing.T) {
	root := BinaryTree.TreeNode{Val: 1}
	root.Right = &BinaryTree.TreeNode{Val: 2}
	root.Right.Left = &BinaryTree.TreeNode{Val: 3}
	res := inorderTraversal2(&root)
	fmt.Println(res)
}
