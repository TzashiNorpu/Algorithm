package minDepth

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestMinDepth(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 3}
	root.Left = &BinaryTree.TreeNode{Val: 9}
	root.Right = &BinaryTree.TreeNode{Val: 6}
	//root.Left.Left = &BinaryTree.TreeNode{Val: 4}
	root.Right.Left = &BinaryTree.TreeNode{Val: 3}
	root.Right.Right = &BinaryTree.TreeNode{Val: 7}
	fmt.Println(bfs(root))
	fmt.Println(dfs(root))
}
