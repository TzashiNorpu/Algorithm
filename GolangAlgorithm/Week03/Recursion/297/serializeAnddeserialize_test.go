package serializeAnddeserialize

import (
	"Week03/Tree/BinaryTree"
	PreorderTraversal "Week03/Tree/BinaryTree/144"
	"fmt"
	"testing"
)

func TestSerializeAndDeserialize(t *testing.T) {
	root := &BinaryTree.TreeNode{Val: 1}
	root.Left = &BinaryTree.TreeNode{Val: 2}
	root.Right = &BinaryTree.TreeNode{Val: 3}
	root.Right.Left = &BinaryTree.TreeNode{Val: 4}
	root.Right.Left.Left = &BinaryTree.TreeNode{Val: 6}
	root.Right.Left.Right = &BinaryTree.TreeNode{Val: 7}
	root.Right.Right = &BinaryTree.TreeNode{Val: 5}
	codec := Constructor()

	serialize := codec.bfsSerialize(root)
	fmt.Println(serialize)
	deserializeTree := codec.bfsDeserialize(serialize)
	fmt.Println(PreorderTraversal.PreorderTraversal(deserializeTree))
}
