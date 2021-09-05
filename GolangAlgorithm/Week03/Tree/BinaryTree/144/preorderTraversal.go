package preorderTraversal

import "Week03/Tree/BinaryTree"

func preorderTraversal(root *BinaryTree.TreeNode) []int {
	res := make([]int, 0)
	var traverse func(root *BinaryTree.TreeNode)
	traverse = func(root *BinaryTree.TreeNode) {
		if root == nil {
			return
		}
		res = append(res, root.Val)
		traverse(root.Left)
		traverse(root.Right)
	}
	traverse(root)
	return res
}
