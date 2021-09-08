package lowestCommonAncestor

import "Week03/Tree/BinaryTree"

func lowestCommonAncestor(root, p, q *BinaryTree.TreeNode) *BinaryTree.TreeNode {
	mapCount := map[int]int{}
	pVal := p.Val
	qVal := q.Val
	var res *BinaryTree.TreeNode
	var dfs func(root *BinaryTree.TreeNode, val int)
	dfs = func(root *BinaryTree.TreeNode, val int) {
		if root == nil {
			return
		}
		mapCount[root.Val] = mapCount[root.Val] + 1
		if root.Left.Val == val || root.Right.Val == val {
			return
		}
		dfs(root.Left, val)
		dfs(root.Right, val)
	}
	dfs(root, pVal)
	dfs(root, qVal)
	for k, v := range mapCount {
		if v == 2 {
			res = &BinaryTree.TreeNode{Val: k}
			break
		}
	}
	return res
}
