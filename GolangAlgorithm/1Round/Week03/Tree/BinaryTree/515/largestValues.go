package largestValues

import "Week03/Tree/BinaryTree"

// bfs
func largestValuesByBFS(root *BinaryTree.TreeNode) []int {
	res := make([]int, 0)
	if root == nil {
		return res
	}
	stack := make([]*BinaryTree.TreeNode, 0)
	stack = append(stack, root)
	for len(stack) > 0 {
		size := len(stack)
		max := stack[0].Val
		for i := 0; i < size; i++ {
			node := stack[i]
			if node.Val > max {
				max = node.Val
			}
			if node.Left != nil {
				stack = append(stack, node.Left)
			}
			if node.Right != nil {
				stack = append(stack, node.Right)
			}
		}
		res = append(res, max)
		stack = stack[size:]
	}
	return res
}

// dfs
func largestValuesByDFS(root *BinaryTree.TreeNode) []int {
	res := []int{}
	var dfs func(root *BinaryTree.TreeNode, level int)
	dfs = func(root *BinaryTree.TreeNode, level int) {
		if root == nil {
			return
		}
		if len(res) <= level {
			res = append(res, root.Val)
		} else {
			if res[level] < root.Val {
				res[level] = root.Val
			}
		}
		dfs(root.Left, level+1)
		dfs(root.Right, level+1)
	}
	dfs(root, 0)
	return res
}
