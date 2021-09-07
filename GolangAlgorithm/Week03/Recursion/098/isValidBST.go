package isValidBST

import (
	"Week03/Tree/BinaryTree"
	"math"
)

func isValidBST1(root *BinaryTree.TreeNode) bool {
	var inorderTraverse func(root *BinaryTree.TreeNode) bool
	res := make([]int, 0)
	inorderTraverse = func(root *BinaryTree.TreeNode) bool {
		if root == nil {
			return true
		}
		boolLeft := inorderTraverse(root.Left)
		if len(res) > 0 {
			if root.Val <= res[len(res)-1] {
				return false
			}
		}
		res = append(res, root.Val)
		boolRight := inorderTraverse(root.Right)
		return boolLeft && boolRight
	}
	return inorderTraverse(root)
}

func isValidBST2(root *BinaryTree.TreeNode) bool {
	return helper(root, math.MinInt64, math.MaxInt64)
}

func helper(root *BinaryTree.TreeNode, lower int, upper int) bool {
	if root == nil {
		return true
	}
	if root.Val <= lower || root.Val >= upper {
		return false
	}
	// 左边分分支用当前节点值作为upper->左边节点值都应当小于upper
	// 右边分分支用当前节点值作为lower->右边节点值都应当大于lower
	return helper(root.Left, lower, root.Val) && helper(root.Right, root.Val, upper)
}
