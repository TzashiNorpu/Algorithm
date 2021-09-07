package maxDepth

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestMaxDepth(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 5}
	root.Left = &BinaryTree.TreeNode{Val: 4}
	root.Right = &BinaryTree.TreeNode{Val: 6}
	root.Right.Left = &BinaryTree.TreeNode{Val: 3}
	root.Right.Right = &BinaryTree.TreeNode{Val: 7}
	fmt.Println(dfs(root))
}
