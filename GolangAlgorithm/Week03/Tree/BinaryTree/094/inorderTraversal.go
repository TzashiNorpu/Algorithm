package inorderTraversal

import "Week03/Tree/BinaryTree"

func inorderTraversal1(root *BinaryTree.TreeNode) []int {
	res := make([]int, 0)
	var traverse func(root *BinaryTree.TreeNode)
	traverse = func(root *BinaryTree.TreeNode) {
		if root == nil {
			return
		}
		traverse(root.Left)
		res = append(res, root.Val)
		traverse(root.Right)
	}
	traverse(root)
	return res
}

func inorderTraversal2(root *BinaryTree.TreeNode) (res *[]int) {
	if root == nil {
		return
	}
	inorderTraversal1(root.Left)
	// 这种方式 *res 会报错，此时还没有分内存地址
	temp := append(*res, root.Val)
	res = &temp
	// 递归调用时 res 被覆盖
	inorderTraversal1(root.Right)
	return res
}
