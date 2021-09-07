package invertTree

import "Week03/Tree/BinaryTree"

func invertTree(root *BinaryTree.TreeNode) *BinaryTree.TreeNode {
	if root == nil {
		return root
	}
	temp := root.Left
	root.Left = root.Right
	root.Right = temp
	invertTree(root.Right)
	invertTree(root.Left)
	return root
}
