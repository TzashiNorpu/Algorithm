package isValidBST

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestIsValidBST(t *testing.T) {
	/*root := &BinaryTree.TreeNode{Val: 5}
	root.Left = &BinaryTree.TreeNode{Val: 4}
	root.Right = &BinaryTree.TreeNode{Val: 6}
	root.Right.Left = &BinaryTree.TreeNode{Val: 3}
	root.Right.Right = &BinaryTree.TreeNode{Val: 7}*/

	root := &BinaryTree.TreeNode{Val: 2}
	root.Left = &BinaryTree.TreeNode{Val: 1}
	root.Right = &BinaryTree.TreeNode{Val: 6}
	fmt.Println(isValidBST1(root))
	fmt.Println(isValidBST2(root))
}
