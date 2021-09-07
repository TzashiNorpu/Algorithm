package minDepth

import "Week03/Tree/BinaryTree"

func minDepth(root *BinaryTree.TreeNode) int {
	min := 0
	var traverse func(root *BinaryTree.TreeNode, level int)
	traverse = func(root *BinaryTree.TreeNode, level int) {
		if root.Left == nil && root.Right == nil {
			min = level
			return
		}
		level = level + 1
		traverse(root.Left, level)
		traverse(root.Right, level)
	}
	traverse(root, min)
	return min
}
