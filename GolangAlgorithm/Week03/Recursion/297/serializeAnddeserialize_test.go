package serializeAnddeserialize

import (
	"Week03/Tree/BinaryTree"
	"fmt"
	"testing"
)

func TestSerializeAnddeserialize(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 1}
	root.Left = &BinaryTree.TreeNode{Val: 2}
	root.Right = &BinaryTree.TreeNode{Val: 3}
	root.Right.Left = &BinaryTree.TreeNode{Val: 4}
	root.Right.Right = &BinaryTree.TreeNode{Val: 5}
	codec := Constructor()

	fmt.Println(codec.bfsDerialize(root))
}
